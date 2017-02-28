/** 
 * Project Name:o2p-serviceAgent-core 
 * File Name:a.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.route.service.batch 
 * Date:2015年2月3日上午10:57:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.route.service.batch.xml;  
/** 
 * ClassName:a  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年2月3日 上午10:57:31  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *    
 */
import javax.xml.stream.XMLEventReader;


/**
 * Interface for event readers which support treating XML fragments as standalone XML documents
 * by wrapping the fragments with StartDocument and EndDocument events.
 * 
 * @author Robert Kasanicky
 */
public interface FragmentEventReader extends XMLEventReader {

	/**
	 * Tells the event reader its cursor position is exactly before the fragment.
	 */
	void markStartFragment();
	
	/**
	 * Tells the event reader the current fragment has been processed.
	 * If the cursor is still inside the fragment it should be moved
	 * after the end of the fragment.
	 */
	void markFragmentProcessed();
	
	/**
	 * Reset the state of the fragment reader - make it forget
	 * it assumptions about current position of cursor
	 * (e.g. in case of rollback of the wrapped reader).
	 */
	void reset();

}
