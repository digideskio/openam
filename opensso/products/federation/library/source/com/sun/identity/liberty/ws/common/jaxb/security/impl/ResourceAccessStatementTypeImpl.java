//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.security.impl;

public class ResourceAccessStatementTypeImpl
    extends com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl
    implements com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType _ProxySubject;
    protected com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType _ResourceID;
    protected com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType _EncryptedResourceID;
    protected com.sun.identity.liberty.ws.common.jaxb.security.SessionContextType _SessionContext;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.security.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementType.class);
    }

    public com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType getProxySubject() {
        return _ProxySubject;
    }

    public void setProxySubject(com.sun.identity.liberty.ws.common.jaxb.assertion.SubjectType value) {
        _ProxySubject = value;
    }

    public com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType getResourceID() {
        return _ResourceID;
    }

    public void setResourceID(com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType value) {
        _ResourceID = value;
    }

    public com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType getEncryptedResourceID() {
        return _EncryptedResourceID;
    }

    public void setEncryptedResourceID(com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType value) {
        _EncryptedResourceID = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.security.SessionContextType getSessionContext() {
        return _SessionContext;
    }

    public void setSessionContext(com.sun.identity.liberty.ws.common.jaxb.security.SessionContextType value) {
        _SessionContext = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeBody(context);
        if ((_EncryptedResourceID == null)&&(_ResourceID!= null)) {
            if (_ResourceID instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
            } else {
                context.startElement("urn:liberty:disco:2003-08", "ResourceID");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
                context.endElement();
            }
        } else {
            if ((_EncryptedResourceID!= null)&&(_ResourceID == null)) {
                if (_EncryptedResourceID instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                } else {
                    context.startElement("urn:liberty:disco:2003-08", "EncryptedResourceID");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                    context.endElement();
                }
            }
        }
        if (_ProxySubject!= null) {
            context.startElement("urn:liberty:sec:2003-08", "ProxySubject");
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ProxySubject), "ProxySubject");
            context.endNamespaceDecls();
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ProxySubject), "ProxySubject");
            context.endAttributes();
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _ProxySubject), "ProxySubject");
            context.endElement();
            if (_SessionContext!= null) {
                if (_SessionContext instanceof javax.xml.bind.Element) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                } else {
                    context.startElement("urn:liberty:sec:2003-08", "SessionContext");
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                    context.endNamespaceDecls();
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                    context.endAttributes();
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                    context.endElement();
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeAttributes(context);
        if ((_EncryptedResourceID == null)&&(_ResourceID!= null)) {
            if (_ResourceID instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
            }
        } else {
            if ((_EncryptedResourceID!= null)&&(_ResourceID == null)) {
                if (_EncryptedResourceID instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                }
            }
        }
        if (_ProxySubject!= null) {
            if (_SessionContext!= null) {
                if (_SessionContext instanceof javax.xml.bind.Element) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        super.serializeURIs(context);
        if ((_EncryptedResourceID == null)&&(_ResourceID!= null)) {
            if (_ResourceID instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ResourceID), "ResourceID");
            }
        } else {
            if ((_EncryptedResourceID!= null)&&(_ResourceID == null)) {
                if (_EncryptedResourceID instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _EncryptedResourceID), "EncryptedResourceID");
                }
            }
        }
        if (_ProxySubject!= null) {
            if (_SessionContext!= null) {
                if (_SessionContext instanceof javax.xml.bind.Element) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _SessionContext), "SessionContext");
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000s"
+"q\u0000~\u0000\u0007ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001cco"
+"m.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003sr\u0000\u0011ja"
+"va.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.gramma"
+"r.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\fxq\u0000~\u0000\u0003q"
+"\u0000~\u0000\u0014psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u0013\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar.AnyNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"psr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000"
+"~\u0000 xq\u0000~\u0000\u001bt\u0000@com.sun.identity.liberty.ws.common.jaxb.assertio"
+"n.SubjectElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elemen"
+"tssq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014p"
+"q\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000=com.sun.identity.liberty.ws.common.j"
+"axb.assertion.SubjectTypeq\u0000~\u0000#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014psr\u0000\u001bcom.su"
+"n.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatyp"
+"e/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringP"
+"air;xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'co"
+"m.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespace"
+"Uriq\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatyp"
+"e/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSch"
+"emat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$"
+"Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullS"
+"etExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0014psr\u0000\u001bcom.sun.msv.util.Stri"
+"ngPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u0000"
+"9q\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-insta"
+"nceq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0007Subjectt\u0000%urn:oasis:names:tc:SAML:1.0:asser"
+"tionsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001e"
+"sq\u0000~\u0000\u001ft\u00009com.sun.identity.liberty.ws.common.jaxb.ps.SubjectE"
+"lementq\u0000~\u0000#sq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Dcom.sun.identity.liberty.ws.common.jaxb.secu"
+"rity.ProxySubjectElementq\u0000~\u0000#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007q\u0000~\u0000\u0014psq\u0000~\u0000\u0007q\u0000~\u0000\u0014"
+"psq\u0000~\u0000\u0007q\u0000~\u0000\u0014psq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000"
+"~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00008com.sun.identity.liberty.ws.disco.jaxb"
+".ResourceIDElementq\u0000~\u0000#sq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007p"
+"psq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00005com.sun.ide"
+"ntity.liberty.ws.disco.jaxb.ResourceIDTypeq\u0000~\u0000#sq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\nResourceIDt\u0000\u0019urn:liberty:disc"
+"o:2003-08sq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Acom.sun.identity.liberty.ws.disco.jaxb.Enc"
+"ryptedResourceIDElementq\u0000~\u0000#sq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq"
+"\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000>com.su"
+"n.identity.liberty.ws.disco.jaxb.EncryptedResourceIDTypeq\u0000~\u0000"
+"#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0013EncryptedResour"
+"ceIDq\u0000~\u0000iq\u0000~\u0000\u001esq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000q\u0000~\u0000\u0014psq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000"
+"\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~"
+"\u0000+q\u0000~\u0000#sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\fProxySubj"
+"ectt\u0000\u0017urn:liberty:sec:2003-08sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007q\u0000~\u0000\u0014psq\u0000~\u0000\u000bq\u0000~\u0000\u0014"
+"p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Fco"
+"m.sun.identity.liberty.ws.common.jaxb.security.SessionContex"
+"tElementq\u0000~\u0000#sq\u0000~\u0000\u000bq\u0000~\u0000\u0014p\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u000bpp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0010q\u0000~"
+"\u0000\u0014psq\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000Ccom.sun.identity.libe"
+"rty.ws.common.jaxb.security.SessionContextTypeq\u0000~\u0000#sq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\u0014pq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u000eSessionContextq\u0000~\u0000\u0089q\u0000~\u0000\u001eq"
+"\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpT"
+"ablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-"
+"com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005c"
+"ountB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Express"
+"ionPool;xp\u0000\u0000\u0000-\u0001pq\u0000~\u0000%q\u0000~\u0000^q\u0000~\u0000qq\u0000~\u0000\u007fq\u0000~\u0000\u000fq\u0000~\u0000\'q\u0000~\u0000Hq\u0000~\u0000Nq\u0000~\u0000"
+"Xq\u0000~\u0000`q\u0000~\u0000kq\u0000~\u0000sq\u0000~\u0000\u0081q\u0000~\u0000,q\u0000~\u0000eq\u0000~\u0000xq\u0000~\u0000\u0085q\u0000~\u0000\u008dq\u0000~\u0000\tq\u0000~\u0000Uq\u0000~\u0000"
+"\u0095q\u0000~\u0000\u009aq\u0000~\u0000\u0093q\u0000~\u0000}q\u0000~\u0000|q\u0000~\u0000\u0012q\u0000~\u0000(q\u0000~\u0000Iq\u0000~\u0000Oq\u0000~\u0000Yq\u0000~\u0000aq\u0000~\u0000lq\u0000~\u0000"
+"tq\u0000~\u0000\nq\u0000~\u0000Vq\u0000~\u0000Tq\u0000~\u0000\u0082q\u0000~\u0000\u008eq\u0000~\u0000\u0096q\u0000~\u0000\u008bq\u0000~\u0000\u0006q\u0000~\u0000Sq\u0000~\u0000\bq\u0000~\u0000\u008aq\u0000~\u0000"
+"\u0005x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  5 :
                        if (("EncryptableNameIdentifier" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            _ProxySubject = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameIdentifier" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _ProxySubject = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("NameIdentifier" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _ProxySubject = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _ProxySubject = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _ProxySubject = ((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectTypeImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("", "AssertionIssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  7 :
                        if (("SessionContext" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            _SessionContext = ((com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextElementImpl.class), 8, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("SessionContext" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 9;
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  0 :
                        if (("Subject" == ___local)&&("urn:liberty:iff:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("ProxySubject" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("ProxySubject" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  1 :
                        if (("ResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            _ResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("ResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 2;
                            return ;
                        }
                        if (("EncryptedResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            _EncryptedResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("EncryptedResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  11 :
                        if (("EncryptedData" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            _EncryptedResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDTypeImpl.class), 12, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("EncryptedData" == ___local)&&("http://www.w3.org/2001/04/xmlenc#" == ___uri)) {
                            _EncryptedResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.disco.jaxb.impl.EncryptedResourceIDTypeImpl.class), 12, ___uri, ___local, ___qname, __atts));
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
                    case  2 :
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  6 :
                        if (("ProxySubject" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  9 :
                        attIdx = context.getAttribute("", "AssertionIssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  3 :
                        if (("ResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 8;
                        continue outer;
                    case  10 :
                        if (("SessionContext" == ___local)&&("urn:liberty:sec:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 8;
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  12 :
                        if (("EncryptedResourceID" == ___local)&&("urn:liberty:disco:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 4;
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
                        if (("id" == ___local)&&("" == ___uri)) {
                            _ResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDTypeImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        if (("AssertionIssueInstant" == ___local)&&("" == ___uri)) {
                            _SessionContext = ((com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextTypeImpl.class), 10, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  0 :
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 8;
                        continue outer;
                    case  1 :
                        state = 4;
                        continue outer;
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
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        attIdx = context.getAttribute("", "AssertionIssueInstant");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  0 :
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, ___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 8;
                        continue outer;
                    case  1 :
                        state = 4;
                        continue outer;
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
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _ResourceID = ((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDTypeImpl) spawnChildFromText((com.sun.identity.liberty.ws.disco.jaxb.impl.ResourceIDTypeImpl.class), 3, value));
                            return ;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  9 :
                            attIdx = context.getAttribute("", "AssertionIssueInstant");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  7 :
                            state = 8;
                            continue outer;
                        case  0 :
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.SubjectStatementAbstractTypeImpl)com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl.this).new Unmarshaller(context)), 1, value);
                            return ;
                        case  4 :
                            state = 8;
                            continue outer;
                        case  1 :
                            state = 4;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
