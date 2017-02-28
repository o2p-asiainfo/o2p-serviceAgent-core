package com.ailk.eaap.op2.serviceagent.common;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.namespace.NamespaceContext;

public class DefaultNamespaceContext implements NamespaceContext{

	private Map<String, String> map;
    private NamespaceContext parent;

    public DefaultNamespaceContext() {        
    }
    
    public DefaultNamespaceContext( Map<String, String> map) {        
        this.map = map;
    }

    public DefaultNamespaceContext(NamespaceContext parent, Map<String, String> map) {
        this.parent = parent;
        this.map = map;
    }

    /**
     * A helper method to make it easy to create newly populated instances
     */
    public DefaultNamespaceContext add(String prefix, String uri) {
        map.put(prefix, uri);
        return this;
    }

    public String getNamespaceURI(String prefix) {
    	if(map != null){
	        String answer = map.get(prefix);
	        if (answer == null && parent != null) {
	            return parent.getNamespaceURI(prefix);
	        }
	        return answer;
    	}else {
    		return null;
    	}
    }

    public String getPrefix(String namespaceURI) {
        for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<String, String> entry = iter.next();
            if (namespaceURI.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        if (parent != null) {
            return parent.getPrefix(namespaceURI);
        }
        return null;
    }

    public Iterator<String> getPrefixes(String namespaceURI) {
        Set<String> set = new HashSet<String>();
        for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext();) {
            Map.Entry<String, String> entry = iter.next();
            if (namespaceURI.equals(entry.getValue())) {
                set.add(entry.getKey());
            }
        }
        if (parent != null) {
            Iterator<String> iter = CastUtils.cast(parent.getPrefixes(namespaceURI));
            while (iter.hasNext()) {
                set.add(iter.next());
            }
        }
        return set.iterator();
    }

    
    public void setNamespaces(Map<String, String> namespaces) {
        map.putAll(namespaces);
    }
}
