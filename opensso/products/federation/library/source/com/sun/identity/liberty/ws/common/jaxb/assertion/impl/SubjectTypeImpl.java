//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion.impl;

public class SubjectTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationType _SubjectConfirmation;
    protected com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType _NameIdentifier;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType.class);
    }

    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationType getSubjectConfirmation() {
        return _SubjectConfirmation;
    }

    public void setSubjectConfirmation(com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectConfirmationType value) {
        _SubjectConfirmation = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType getNameIdentifier() {
        return _NameIdentifier;
    }

    public void setNameIdentifier(com.sun.identity.liberty.ws.common.jaxb.assertion.NameIdentifierType value) {
        _NameIdentifier = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_NameIdentifier!= null) {
            if (_NameIdentifier instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
            } else {
                context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "NameIdentifier");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
                context.endElement();
            }
            if (_SubjectConfirmation!= null) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                } else {
                    context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectConfirmation");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endElement();
                }
            }
        } else {
            if ((_NameIdentifier == null)&&(_SubjectConfirmation!= null)) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                } else {
                    context.startElement("urn:oasis:names:tc:SAML:1.0:assertion", "SubjectConfirmation");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                    context.endElement();
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_NameIdentifier!= null) {
            if (_NameIdentifier instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
            }
            if (_SubjectConfirmation!= null) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                }
            }
        } else {
            if ((_NameIdentifier == null)&&(_SubjectConfirmation!= null)) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (_NameIdentifier!= null) {
            if (_NameIdentifier instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _NameIdentifier), "NameIdentifier");
            }
            if (_SubjectConfirmation!= null) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                }
            }
        } else {
            if ((_NameIdentifier == null)&&(_SubjectConfirmation!= null)) {
                if (_SubjectConfirmation instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SubjectConfirmation), "SubjectConfirmation");
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001fcom.sun.msv.grammar.SequenceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000s"
+"q\u0000~\u0000\u0000ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cco"
+"m.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011ja"
+"va.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gramma"
+"r.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\fxq\u0000~\u0000\u0003q"
+"\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"psr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000"
+"~\u0000 xq\u0000~\u0000\u001bt\u0000Gcom.sun.identity.liberty.ws.common.jaxb.assertio"
+"n.NameIdentifierElementt\u0000+http://java.sun.com/jaxb/xjc/dummy"
+"-elementssq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000"
+"\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Dcom.sun.identity.liberty.ws.c"
+"ommon.jaxb.assertion.NameIdentifierTypeq\u0000~\u0000#sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015q\u0000"
+"~\u0000\u0014psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/r"
+"elaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/ms"
+"v/util/StringPair;xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000\"com.sun.msv.datatype.xsd.Q"
+"nameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomi"
+"cType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/s"
+"un/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.o"
+"rg/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteS"
+"paceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xs"
+"d.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Ex"
+"pression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000\u001bcom.sun"
+".msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespace"
+"URIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/X"
+"MLSchema-instanceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000eNameIdentifiert\u0000%urn:oasis:na"
+"mes:tc:SAML:1.0:assertionsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015"
+"q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Kcom.sun.identity.liberty.ws.co"
+"mmon.jaxb.ps.EncryptableNameIdentifierElementq\u0000~\u0000#sq\u0000~\u0000\u0000ppsq"
+"\u0000~\u0000\u0000q\u0000~\u0000\u0014psq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018"
+"q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Lcom.sun.identity.liberty.ws.common.jaxb.a"
+"ssertion.SubjectConfirmationElementq\u0000~\u0000#sq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u0000Icom.sun.identity.liberty.ws.common.jaxb.assertion.Subj"
+"ectConfirmationTypeq\u0000~\u0000#sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001es"
+"q\u0000~\u0000\u001ft\u0000\u0013SubjectConfirmationq\u0000~\u0000Fq\u0000~\u0000\u001esq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010"
+"q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000Tq\u0000~\u0000#sq\u0000~\u0000\u000bpp\u0000sq"
+"\u0000~\u0000\u0007ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~"
+"\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000\\q\u0000~\u0000#sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001fq"
+"\u0000~\u0000`q\u0000~\u0000Fsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;x"
+"psr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000"
+"\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Ex"
+"pressionPool;xp\u0000\u0000\u0000\u001b\u0001pq\u0000~\u0000%q\u0000~\u0000Vq\u0000~\u0000gq\u0000~\u0000\u000fq\u0000~\u0000\'q\u0000~\u0000Hq\u0000~\u0000Pq\u0000~\u0000"
+"Xq\u0000~\u0000bq\u0000~\u0000iq\u0000~\u0000,q\u0000~\u0000]q\u0000~\u0000mq\u0000~\u0000\tq\u0000~\u0000\u0012q\u0000~\u0000(q\u0000~\u0000Iq\u0000~\u0000Qq\u0000~\u0000Yq\u0000~\u0000"
+"cq\u0000~\u0000jq\u0000~\u0000\nq\u0000~\u0000Nq\u0000~\u0000\u0006q\u0000~\u0000Mq\u0000~\u0000\bq\u0000~\u0000\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "---------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  5 :
                        if (("ConfirmationMethod" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _SubjectConfirmation = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  3 :
                        if (("ConfirmationMethod" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _SubjectConfirmation = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationTypeImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  2 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("EncryptableNameIdentifier" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            _NameIdentifier = ((com.sun.identity.liberty.ws.common.jaxb.ps.impl.EncryptableNameIdentifierElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ps.impl.EncryptableNameIdentifierElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameIdentifier" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _NameIdentifier = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameIdentifier" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 7;
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _SubjectConfirmation = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        break;
                    case  1 :
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _SubjectConfirmation = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectConfirmationElementImpl.class), 2, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 3;
                            return ;
                        }
                        state = 2;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "Format");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "NameQualifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  8 :
                        if (("NameIdentifier" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  2 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  4 :
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 2;
                            return ;
                        }
                        break;
                    case  1 :
                        state = 2;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "Format");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "NameQualifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 2;
                        continue outer;
                    case  7 :
                        if (("Format" == ___local)&&("" == ___uri)) {
                            _NameIdentifier = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl.class), 8, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("NameQualifier" == ___local)&&("" == ___uri)) {
                            _NameIdentifier = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl.class), 8, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        state = 2;
                        continue outer;
                    case  7 :
                        attIdx = context.getAttribute("", "Format");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "NameQualifier");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  2 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            continue outer;
                        case  7 :
                            attIdx = context.getAttribute("", "Format");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "NameQualifier");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _NameIdentifier = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.NameIdentifierTypeImpl.class), 8, value));
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
