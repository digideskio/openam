//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * Java content class for AddressType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-id-sis-pp.xsd line 166)
 * <p>
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}PostalAddress" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}LPostalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}PostalCode" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}L" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}LL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}St" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}LSt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}C" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:liberty:id-sis-pp:2003-08}commonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AddressType {


    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType getExtension();

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType}
     */
    void setExtension(com.sun.identity.liberty.ws.idpp.jaxb.ExtensionType value);

    /**
     * Gets the value of the LPostalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the LPostalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.LPostalAddressElement}
     * 
     */
    java.util.List getLPostalAddress();

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.PostalCodeElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getPostalCode();

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.PostalCodeElement}
     */
    void setPostalCode(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the modificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getModificationTime();

    /**
     * Sets the value of the modificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setModificationTime(java.util.Calendar value);

    /**
     * Gets the value of the c property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.CElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getC();

    /**
     * Sets the value of the c property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.CElement}
     */
    void setC(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.LElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getL();

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.LElement}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     */
    void setL(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.PostalAddressElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getPostalAddress();

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.PostalAddressElement}
     */
    void setPostalAddress(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the LL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the LL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.LLElement}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     * 
     */
    java.util.List getLL();

    /**
     * Gets the value of the st property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.StElement}
     */
    com.sun.identity.liberty.ws.idpp.jaxb.DSTString getSt();

    /**
     * Sets the value of the st property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTString}
     *     {@link com.sun.identity.liberty.ws.idpp.jaxb.StElement}
     */
    void setSt(com.sun.identity.liberty.ws.idpp.jaxb.DSTString value);

    /**
     * Gets the value of the LSt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the LSt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLSt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.LStElement}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.DSTLocalizedString}
     * 
     */
    java.util.List getLSt();

}