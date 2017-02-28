/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:a.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch.xml 
 * Date:2015年2月3日上午11:03:00 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch.xml;  

import java.util.NoSuchElementException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.springframework.dao.DataAccessResourceFailureException;

/** 
 * ClassName:a  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月3日 上午11:03:00  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
/**
 * Default implementation of {@link FragmentEventReader}
 * 
 * @author Robert Kasanicky
 */
public class DefaultFragmentEventReader extends AbstractEventReaderWrapper implements FragmentEventReader {

	// true when the next event is the StartElement of next fragment
	private boolean startFragmentFollows = false;

	// true when the next event is the EndElement of current fragment
	private boolean endFragmentFollows = false;

	// true while cursor is inside fragment
	private boolean insideFragment = false;

	// true when reader should behave like the cursor was at the end of document
	private boolean fakeDocumentEnd = false;

	private StartDocument startDocumentEvent = null;

	private EndDocument endDocumentEvent = null;

	// fragment root name is remembered so that the matching closing element can
	// be identified
	private QName fragmentRootName = null;

	// counts the occurrences of current fragmentRootName (increased for
	// StartElement, decreased for EndElement)
	private int matchCounter = 0;

	/**
	 * Caches the StartDocument event for later use.
	 * @param wrappedEventReader the original wrapped event reader
	 */
	public DefaultFragmentEventReader(XMLEventReader wrappedEventReader) {
		super(wrappedEventReader);
		try {
			startDocumentEvent = (StartDocument) wrappedEventReader.peek();
		}
		catch (XMLStreamException e) {
			throw new DataAccessResourceFailureException("Error reading start document from event reader", e);
		}

		endDocumentEvent = XMLEventFactory.newInstance().createEndDocument();
	}

	public void markStartFragment() {
		startFragmentFollows = true;
		fragmentRootName = null;
	}

	public boolean hasNext() {
		try {
			if (peek() != null) {
				return true;
			}
		}
		catch (XMLStreamException e) {
			throw new DataAccessResourceFailureException("Error reading XML stream", e);
		}
		return false;
	}

	public Object next() {
		try {
			return nextEvent();
		}
		catch (XMLStreamException e) {
			throw new DataAccessResourceFailureException("Error reading XML stream", e);
		}
	}

	public XMLEvent nextEvent() throws XMLStreamException {
		if (fakeDocumentEnd) {
			throw new NoSuchElementException();
		}
		XMLEvent event = wrappedEventReader.peek();
		XMLEvent proxyEvent = alterEvent(event, false);
		checkFragmentEnd(proxyEvent);
		if (event == proxyEvent) {
			wrappedEventReader.nextEvent();
		}

		return proxyEvent;
	}

	/**
	 * Sets the endFragmentFollows flag to true if next event is the last event
	 * of the fragment.
	 * @param event peek() from wrapped event reader
	 */
	private void checkFragmentEnd(XMLEvent event) {
		if (event.isStartElement() && ((StartElement) event).getName().equals(fragmentRootName)) {
			matchCounter++;
		}
		else if (event.isEndElement() && ((EndElement) event).getName().equals(fragmentRootName)) {
			matchCounter--;
			if (matchCounter == 0) {
				endFragmentFollows = true;
			}
		}
	}

	/**
	 * @param event peek() from wrapped event reader
	 * @param peek if true do not change the internal state
	 * @return StartDocument event if peek() points to beginning of fragment
	 * EndDocument event if cursor is right behind the end of fragment original
	 * event otherwise
	 */
	private XMLEvent alterEvent(XMLEvent event, boolean peek) {
		if (startFragmentFollows) {
			fragmentRootName = ((StartElement) event).getName();
			if (!peek) {
				startFragmentFollows = false;
				insideFragment = true;
			}
			return startDocumentEvent;
		}
		else if (endFragmentFollows) {
			if (!peek) {
				endFragmentFollows = false;
				insideFragment = false;
				fakeDocumentEnd = true;
			}
			return endDocumentEvent;
		}
		return event;
	}

	public XMLEvent peek() throws XMLStreamException {
		if (fakeDocumentEnd) {
			return null;
		}
		return alterEvent(wrappedEventReader.peek(), true);
	}

	/**
	 * Finishes reading the fragment in case the fragment was processed without
	 * being read until the end.
	 */
	public void markFragmentProcessed() {
		fakeDocumentEnd = false;
	}

	public void reset() {
		insideFragment = false;
		startFragmentFollows = false;
		endFragmentFollows = false;
		fakeDocumentEnd = false;
	}

}

