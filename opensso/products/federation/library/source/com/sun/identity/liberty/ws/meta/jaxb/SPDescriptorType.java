//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.meta.jaxb;


/**
 * Java content class for SPDescriptorType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-metadata.xsd line 184)
 * <p>
 * <pre>
 * &lt;complexType name="SPDescriptorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:liberty:metadata:2003-08}providerDescriptorType">
 *       &lt;sequence>
 *         &lt;element name="AssertionConsumerServiceURL" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AuthnRequestsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SPDescriptorType
    extends com.sun.identity.liberty.ws.meta.jaxb.ProviderDescriptorType
{


    /**
     * Gets the value of the authnRequestsSigned property.
     * 
     */
    boolean isAuthnRequestsSigned();

    /**
     * Sets the value of the authnRequestsSigned property.
     * 
     */
    void setAuthnRequestsSigned(boolean value);

    /**
     * Gets the value of the AssertionConsumerServiceURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the AssertionConsumerServiceURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionConsumerServiceURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.meta.jaxb.SPDescriptorType.AssertionConsumerServiceURLType}
     * 
     */
    java.util.List getAssertionConsumerServiceURL();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-metadata.xsd line 189)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface AssertionConsumerServiceURLType {


        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getValue();

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setValue(java.lang.String value);

        /**
         * Gets the value of the isDefault property.
         * 
         */
        boolean isIsDefault();

        /**
         * Sets the value of the isDefault property.
         * 
         */
        void setIsDefault(boolean value);

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

    }

}