//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for BaseIDAbstractType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 63)
 * <p>
 * <pre>
 * &lt;complexType name="BaseIDAbstractType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:oasis:names:tc:SAML:2.0:assertion}IDNameQualifiers"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface BaseIDAbstractType {


    /**
     * Gets the value of the nameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNameQualifier();

    /**
     * Sets the value of the nameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNameQualifier(java.lang.String value);

    /**
     * Gets the value of the spNameQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSPNameQualifier();

    /**
     * Sets the value of the spNameQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSPNameQualifier(java.lang.String value);

}
