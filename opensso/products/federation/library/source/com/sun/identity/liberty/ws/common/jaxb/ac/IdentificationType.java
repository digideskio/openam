//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * Java content class for IdentificationType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 479)
 * <p>
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:ac:2003-08}PhysicalVerification" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}WrittenConsent" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nym">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="anonymity"/>
 *             &lt;enumeration value="verinymity"/>
 *             &lt;enumeration value="pseudonymity"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface IdentificationType {


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
     * Gets the value of the physicalVerification property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationType getPhysicalVerification();

    /**
     * Sets the value of the physicalVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationElement}
     */
    void setPhysicalVerification(com.sun.identity.liberty.ws.common.jaxb.ac.PhysicalVerificationType value);

    /**
     * Gets the value of the writtenConsent property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentType getWrittenConsent();

    /**
     * Sets the value of the writtenConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentType}
     */
    void setWrittenConsent(com.sun.identity.liberty.ws.common.jaxb.ac.WrittenConsentType value);

    /**
     * Gets the value of the nym property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNym();

    /**
     * Sets the value of the nym property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNym(java.lang.String value);

}
