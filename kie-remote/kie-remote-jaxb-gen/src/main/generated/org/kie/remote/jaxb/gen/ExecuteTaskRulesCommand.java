//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:40:13 PM CEST 
//


package org.kie.remote.jaxb.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for executeTaskRulesCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeTaskRulesCommand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}taskCommand"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{}jaxbStringObjectPairArray" minOccurs="0"/&gt;
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeTaskRulesCommand", propOrder = {
    "data",
    "scope"
})
@XmlRootElement(name = "execute-task-rules-command")
public class ExecuteTaskRulesCommand
    extends TaskCommand
{

    protected JaxbStringObjectPairArray data;
    protected String scope;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbStringObjectPairArray }
     *     
     */
    public JaxbStringObjectPairArray getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbStringObjectPairArray }
     *     
     */
    public void setData(JaxbStringObjectPairArray value) {
        this.data = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

}