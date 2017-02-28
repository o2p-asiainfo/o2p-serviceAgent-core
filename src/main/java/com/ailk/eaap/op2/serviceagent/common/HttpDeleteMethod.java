/** 
 * Project Name:o2p-serviceAgent-core-1.9.3 
 * File Name:HttpDeleteWithBody.java 
 * Package Name:com.ailk.eaap.op2.serviceagent.common 
 * Date:2016年2月25日下午5:26:43 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.serviceagent.common;  

import java.net.URI;
import java.util.Iterator;
import java.util.Vector;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.util.EncodingUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/** 
 * ClassName:HttpDeleteWithBody  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年2月25日 下午5:26:43  
 * @author   wuwz 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class HttpDeleteMethod  extends EntityEnclosingMethod {

	 // -------------------------------------------------------------- Constants

    /** Log object for this class. */
    private static final Log LOG = LogFactory.getLog(DeleteMethod.class);

    /** The Content-Type for www-form-urlencoded. */
    public static final String FORM_URL_ENCODED_CONTENT_TYPE = 
        "application/x-www-form-urlencoded";

    /** 
     * The buffered request body consisting of <code>NameValuePair</code>s. 
     */
    private Vector params = new Vector();

    // ----------------------------------------------------------- Constructors

    /**
     * No-arg constructor.
     *
     * @since 1.0
     */
    public HttpDeleteMethod() {
        super();
    }

    /**
     * Constructor specifying a URI.
     *
     * @param uri either an absolute or relative URI
     *
     * @since 1.0
     */
    public HttpDeleteMethod(String uri) {
        super(uri);
    }

    // ----------------------------------------------------- Instance Methods

    /**
     * Returns <tt>"DELETE"</tt>.
     *
     * @return <tt>"DELETE"</tt>
     *
     * @since 2.0
     */
    public String getName() {
        return "DELETE";
    }


    /**
     * Returns <tt>true</tt> if there is a request body to be sent.
     * 
     * <P>This method must be overwritten by sub-classes that implement
     * alternative request content input methods
     * </p>
     * 
     * @return boolean
     * 
     * @since 2.0beta1
     */
    protected boolean hasRequestContent() {
        LOG.trace("enter DeleteMethod.hasRequestContent()");
        if (!this.params.isEmpty()) {
            return true;
        } else {
            return super.hasRequestContent();
        }
    }

    /**
     * Clears request body.
     * 
     * <p>This method must be overwritten by sub-classes that implement
     * alternative request content input methods</p>
     * 
     * @since 2.0beta1
     */
    protected void clearRequestBody() {
        LOG.trace("enter DeleteMethod.clearRequestBody()");
        this.params.clear();
        super.clearRequestBody();
    }

    /**
     * Generates a request entity from the post parameters, if present.  Calls
     * {@link EntityEnclosingMethod#generateRequestBody()} if parameters have not been set.
     * 
     * @since 3.0
     */
    protected RequestEntity generateRequestEntity() {
        if (!this.params.isEmpty()) {
            // Use a ByteArrayRequestEntity instead of a StringRequestEntity.
            // This is to avoid potential encoding issues.  Form url encoded strings
            // are ASCII by definition but the content type may not be.  Treating the content
            // as bytes allows us to keep the current charset without worrying about how
            // this charset will effect the encoding of the form url encoded string.
            String content = EncodingUtil.formUrlEncode(getParameters(), getRequestCharSet());
            ByteArrayRequestEntity entity = new ByteArrayRequestEntity(
                EncodingUtil.getAsciiBytes(content),
                FORM_URL_ENCODED_CONTENT_TYPE
            );
            return entity;
        } else {
            return super.generateRequestEntity();
        }
    }
    
    /**
     * Sets the value of parameter with parameterName to parameterValue. This method
     * does not preserve the initial insertion order.
     *
     * @param parameterName name of the parameter
     * @param parameterValue value of the parameter
     *
     * @since 2.0
     */
    public void setParameter(String parameterName, String parameterValue) {
        LOG.trace("enter DeleteMethod.setParameter(String, String)");

        removeParameter(parameterName);
        addParameter(parameterName, parameterValue);
    }

    /**
     * Gets the parameter of the specified name. If there exists more than one
     * parameter with the name paramName, then only the first one is returned.
     *
     * @param paramName name of the parameter
     *
     * @return If a parameter exists with the name argument, the coresponding
     *         NameValuePair is returned.  Otherwise null.
     *
     * @since 2.0
     * 
     */
    public NameValuePair getParameter(String paramName) {
        LOG.trace("enter DeleteMethod.getParameter(String)");

        if (paramName == null) {
            return null;
        }

        Iterator iter = this.params.iterator();

        while (iter.hasNext()) {
            NameValuePair parameter = (NameValuePair) iter.next();

            if (paramName.equals(parameter.getName())) {
                return parameter;
            }
        }
        return null;
    }

    /**
     * Gets the parameters currently added to the DeleteMethod. If there are no
     * parameters, a valid array is returned with zero elements. The returned
     * array object contains an array of pointers to  the internal data
     * members.
     *
     * @return An array of the current parameters
     *
     * @since 2.0
     * 
     */
    public NameValuePair[] getParameters() {
        LOG.trace("enter DeleteMethod.getParameters()");

        int numPairs = this.params.size();
        Object[] objectArr = this.params.toArray();
        NameValuePair[] nvPairArr = new NameValuePair[numPairs];

        for (int i = 0; i < numPairs; i++) {
            nvPairArr[i] = (NameValuePair) objectArr[i];
        }

        return nvPairArr;
    }

    /**
     * Adds a new parameter to be used in the POST request body.
     *
     * @param paramName The parameter name to add.
     * @param paramValue The parameter value to add.
     *
     * @throws IllegalArgumentException if either argument is null
     *
     * @since 1.0
     */
    public void addParameter(String paramName, String paramValue) 
    throws IllegalArgumentException {
        LOG.trace("enter DeleteMethod.addParameter(String, String)");

        if ((paramName == null) || (paramValue == null)) {
            throw new IllegalArgumentException(
                "Arguments to addParameter(String, String) cannot be null");
        }
        super.clearRequestBody();
        this.params.add(new NameValuePair(paramName, paramValue));
    }

    /**
     * Adds a new parameter to be used in the POST request body.
     *
     * @param param The parameter to add.
     *
     * @throws IllegalArgumentException if the argument is null or contains
     *         null values
     *
     * @since 2.0
     */
    public void addParameter(NameValuePair param) 
    throws IllegalArgumentException {
        LOG.trace("enter DeleteMethod.addParameter(NameValuePair)");

        if (param == null) {
            throw new IllegalArgumentException("NameValuePair may not be null");
        }
        addParameter(param.getName(), param.getValue());
    }

    /**
     * Adds an array of parameters to be used in the POST request body. Logs a
     * warning if the parameters argument is null.
     *
     * @param parameters The array of parameters to add.
     *
     * @since 2.0
     */
    public void addParameters(NameValuePair[] parameters) {
        LOG.trace("enter DeleteMethod.addParameters(NameValuePair[])");

        if (parameters == null) {
            LOG.warn("Attempt to addParameters(null) ignored");
        } else {
            super.clearRequestBody();
            for (int i = 0; i < parameters.length; i++) {
                this.params.add(parameters[i]);
            }
        }
    }

    /**
     * Removes all parameters with the given paramName. If there is more than
     * one parameter with the given paramName, all of them are removed.  If
     * there is just one, it is removed.  If there are none, then the request
     * is ignored.
     *
     * @param paramName The parameter name to remove.
     *
     * @return true if at least one parameter was removed
     *
     * @throws IllegalArgumentException When the parameter name passed is null
     *
     * @since 2.0
     */
    public boolean removeParameter(String paramName) 
    throws IllegalArgumentException {
        LOG.trace("enter DeleteMethod.removeParameter(String)");

        if (paramName == null) {
            throw new IllegalArgumentException(
                "Argument passed to removeParameter(String) cannot be null");
        }
        boolean removed = false;
        Iterator iter = this.params.iterator();

        while (iter.hasNext()) {
            NameValuePair pair = (NameValuePair) iter.next();

            if (paramName.equals(pair.getName())) {
                iter.remove();
                removed = true;
            }
        }
        return removed;
    }

    /**
     * Removes all parameter with the given paramName and paramValue. If there
     * is more than one parameter with the given paramName, only one is
     * removed.  If there are none, then the request is ignored.
     *
     * @param paramName The parameter name to remove.
     * @param paramValue The parameter value to remove.
     *
     * @return true if a parameter was removed.
     *
     * @throws IllegalArgumentException when param name or value are null
     *
     * @since 2.0
     */
    public boolean removeParameter(String paramName, String paramValue) 
    throws IllegalArgumentException {
        LOG.trace("enter DeleteMethod.removeParameter(String, String)");

        if (paramName == null) {
            throw new IllegalArgumentException("Parameter name may not be null");
        }
        if (paramValue == null) {
            throw new IllegalArgumentException("Parameter value may not be null");
        }

        Iterator iter = this.params.iterator();

        while (iter.hasNext()) {
            NameValuePair pair = (NameValuePair) iter.next();

            if (paramName.equals(pair.getName())
                && paramValue.equals(pair.getValue())) {
                iter.remove();
                return true;
            }
        }

        return false;
    }

    /**
     * Sets an array of parameters to be used in the POST request body
     *
     * @param parametersBody The array of parameters to add.
     *
     * @throws IllegalArgumentException when param parameters are null
     * 
     * @since 2.0beta1
     */
    public void setRequestBody(NameValuePair[] parametersBody)
    throws IllegalArgumentException {
        LOG.trace("enter DeleteMethod.setRequestBody(NameValuePair[])");

        if (parametersBody == null) {
            throw new IllegalArgumentException("Array of parameters may not be null");
        }
        clearRequestBody();
        addParameters(parametersBody);
    }


}
