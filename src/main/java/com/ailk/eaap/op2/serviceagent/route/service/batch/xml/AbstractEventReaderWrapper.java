/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:b.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch.xml 
 * Date:2015年2月3日上午11:04:02 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch.xml;  
/** 
 * ClassName:b  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月3日 上午11:04:02  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

/**
 * Delegates all functionality to the wrapped reader allowing
 * subclasses to override only the methods they want to change.
 * 
 * @author Robert Kasanicky
 */
abstract class AbstractEventReaderWrapper implements XMLEventReader {

	protected XMLEventReader wrappedEventReader;
	
	public AbstractEventReaderWrapper(XMLEventReader wrappedEventReader) {
		this.wrappedEventReader = wrappedEventReader;
	}
	
	public void close() throws XMLStreamException {
		wrappedEventReader.close();
		
	}

	public String getElementText() throws XMLStreamException {
		return wrappedEventReader.getElementText();
	}

	public Object getProperty(String name) throws IllegalArgumentException {
		return wrappedEventReader.getProperty(name);
	}

	public boolean hasNext() {
		return wrappedEventReader.hasNext();
	}

	public XMLEvent nextEvent() throws XMLStreamException {
		return wrappedEventReader.nextEvent();
	}

	public XMLEvent nextTag() throws XMLStreamException {
		return wrappedEventReader.nextTag();
	}

	public XMLEvent peek() throws XMLStreamException {
		return wrappedEventReader.peek();
	}

	public Object next() {
		return wrappedEventReader.next();
	}

	public void remove() {
		wrappedEventReader.remove();
	}

}

