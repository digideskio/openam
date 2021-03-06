//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for ActivationPinType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 611)
 * <p>
 * <pre>
 * &lt;complexType name="ActivationPinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Length" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Alphabet" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Generation" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}ActivationLimit" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ActivationPinType {


    /**
     * Gets the value of the Extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.common.jaxb.ac.ExtensionType}
     * {@link com.sun.identity.liberty.ws.common.jaxb.ac.ExtensionElement}
     * 
     */
    java.util.List getExtension();

    /**
     * Gets the value of the activationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType getActivationLimit();

    /**
     * Sets the value of the activationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitElement}
     */
    void setActivationLimit(com.sun.identity.liberty.ws.common.jaxb.ac.ActivationLimitType value);

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.LengthType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.LengthElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.LengthType getLength();

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.LengthType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.LengthElement}
     */
    void setLength(com.sun.identity.liberty.ws.common.jaxb.ac.LengthType value);

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.GenerationElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType getGeneration();

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.GenerationElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType}
     */
    void setGeneration(com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType value);

    /**
     * Gets the value of the alphabet property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType getAlphabet();

    /**
     * Sets the value of the alphabet property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType}
     */
    void setAlphabet(com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType value);

}
