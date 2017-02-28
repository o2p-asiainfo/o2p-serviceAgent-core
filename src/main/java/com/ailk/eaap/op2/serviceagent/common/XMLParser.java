package com.ailk.eaap.op2.serviceagent.common;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class XMLParser {

    /**
     * 
     * 
     * @param in, InputStream
     */
    public XMLParser(InputStream in) throws Exception
    {
       
        SAXBuilder builder = new SAXBuilder();
        doc = builder.build(in);
    }

    /**
     * 
     * 
     * @param fileName
     */
    public XMLParser(String fileName) throws Exception
    {
        propertyCache = new HashMap();
        file = new File(fileName);
        SAXBuilder builder = new SAXBuilder();
        doc = builder.build(file);
    }

    /**
     * 
     * @param name
     * @return String
     */
    public String getElement(String name)
    {
        
        if (propertyCache!=null && propertyCache.containsKey(name))
        {
            return (String) propertyCache.get(name);
        }
       
        Element element = findElement(parsePropertyName(name));
        if (element == null) 
        {
            return null;
        }
        String value = element.getText();

        if ("".equals(value)) 
        {
            return null;
        }
        else
        {
            value = value.trim();
            propertyCache.put(name, value); 
            return value;
        }
    }

    /**
     * 
     * @param parent
     * @return String Array
     */
    public String[] getChildren(String parent)
    {
        Element element = findElement(parsePropertyName(parent));
        List children = element.getChildren();
        int childCount = children.size();
        String childrenNames[] = new String[childCount];
        for (int i = 0; i < childCount; i++)
        {
            childrenNames[i] = ((Element) children.get(i)).getName();
        }

        return childrenNames;
    }

    /**
     * 
     * @param name
     * @param value
     */
    public void setElement(String name, String value)
    {
        propertyCache.put(name, value);
        Element element = findElement(parsePropertyName(name));
        if (element != null)
        {
            element.setText(value);
        }
    }

    /**
     * 
     * @param parent
     * @param name
     * @param value
     */
    public void addElement(String parent, String name, String value)
    {
        String elementName = parent + "." + name;
        Element element = findElement(parsePropertyName(elementName));
        if (element == null)
        {
            element = findElement(parsePropertyName(parent));
            element.addContent(new Element(name));
            element = element.getChild(name);
            element.setText(value);
        }
        else
        {
            element.setText(value);
        }
        propertyCache.put(elementName, value);
    }

    /**
     * 
     * @param name
     */
    public void removeElement(String name)
    {
        String[] propName = parsePropertyName(name);
        Element element = findElement(propName);
        if (element != null)
        {
           element = element.getParentElement();
            element.removeChild(propName[propName.length - 1], Namespace.getNamespace(DSMP_NAMESPACE));
        }
    }

    /**
     * 
     * @param out
     */
    public synchronized void output(OutputStream out) throws IOException
    {
        new XMLOutputter().output(doc, out);
    }


    /**
     * 
     * @param fileName
     * @throws Exception
     */
    public synchronized void saveAsFile(String fileName) throws Exception
    {
        File file = new File(fileName);
        saveAsFile(file);
    }

    /**
     * 
     * @param file
     */
    public synchronized void saveAsFile(File file) throws Exception
    {
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream(file));
        output(out);
        out.close();

    }
    
    /**
     * 
     * @param name
     * @return String Array
     */
    private String[] parsePropertyName(String name)
    {
        int size = 1;
        for (int i = 0; i < name.length(); i++)
        {
            if (name.charAt(i) == '.')
            {
                size++;
            }
        }

        String propName[] = new String[size];
        StringTokenizer tokenizer = new StringTokenizer(name, ".");
        for (int i = 0; tokenizer.hasMoreTokens(); i++)
        {
            propName[i] = tokenizer.nextToken();
        }

        return propName;
    }

    /**
     * 
     * @param propName
     * @return 
     */
    private Element findElement(String[] propName)
    {
        Element element = doc.getRootElement();

        int index = 0;
        boolean hasNamespace = false;
        for (int i = 0; i < propName.length; i++)
        {
            if (element == null)
            {
                return null;
            }
            index = propName[i].indexOf(":".toCharArray()[0]);
            if (index != -1)
            {
                hasNamespace = true;
                element = element.getChild(propName[i].substring(index + 1), element.getNamespace());
            }
            else
            {
                if (hasNamespace)
                {
                    element = element.getChild(propName[i], Namespace.getNamespace(DSMP_NAMESPACE));
                }
                else
                {
                	element = element.getChild(propName[i]);
                }
            }
        }

        return element;
    }
    
    private File file;

    private Document doc;

    private Map<String , String> propertyCache = new HashMap<String , String>()  ;

    private static String DSMP_NAMESPACE = "http://www.monternet.com/dsmp/schemas/";
    

}
