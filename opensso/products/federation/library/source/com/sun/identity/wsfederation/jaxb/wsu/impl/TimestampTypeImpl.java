//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsu.impl;

public class TimestampTypeImpl implements com.sun.identity.wsfederation.jaxb.wsu.TimestampType, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.xml.bind.marshaller.IdentifiableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Any;
    protected com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime _Created;
    protected com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime _Expires;
    protected java.lang.String _Id;
    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsu.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsu.TimestampType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getAny() {
        if (_Any == null) {
            _Any = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Any;
    }

    public java.util.List getAny() {
        return _getAny();
    }

    public com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime getCreated() {
        return _Created;
    }

    public void setCreated(com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime value) {
        _Created = value;
    }

    public com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime getExpires() {
        return _Expires;
    }

    public void setExpires(com.sun.identity.wsfederation.jaxb.wsu.AttributedDateTime value) {
        _Expires = value;
    }

    public java.lang.String getId() {
        return _Id;
    }

    public void setId(java.lang.String value) {
        _Id = value;
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsu.impl.TimestampTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_Created!= null) {
            if (_Created instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Created), "Created");
            } else {
                context.startElement("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Created");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Created), "Created");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Created), "Created");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Created), "Created");
                context.endElement();
            }
        }
        if (_Expires!= null) {
            if (_Expires instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
            } else {
                context.startElement("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Expires");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Any.get(idx1 ++)), "Any");
        }
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_Id!= null) {
            context.startAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
            try {
                context.text(context.onID(this, ((java.lang.String) _Id)), "Id");
            } catch (java.lang.Exception e) {
                com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_Created!= null) {
            if (_Created instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Created), "Created");
            }
        }
        if (_Expires!= null) {
            if (_Expires instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
            }
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Any == null)? 0 :_Any.size());
        if (_Id!= null) {
            context.getNamespaceContext().declareNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", null, true);
        }
        if (_Created!= null) {
            if (_Created instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Created), "Created");
            }
        }
        if (_Expires!= null) {
            if (_Expires instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Expires), "Expires");
            }
        }
        while (idx1 != len1) {
            idx1 += 1;
        }
    }

    public java.lang.String ____jaxb____getId() {
        return ((java.lang.String) _Id);
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsu.TimestampType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\bsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsr\u0000 com"
+".sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gram"
+"mar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\u000exq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000b\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00005com.sun.identity.wsfederation.jaxb.wsu.C"
+"reatedElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementss"
+"q\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\f"
+"pq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00009com.sun.identity.wsfederation.jaxb."
+"wsu.AttributedDateTimeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsr\u0000\u001bcom.sun.m"
+"sv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/D"
+"atatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair"
+";xq\u0000~\u0000\u0003ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%c"
+"om.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.m"
+"sv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000"
+" L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/W"
+"hiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005Q"
+"Namesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collaps"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0"
+"t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~\u00008s"
+"q\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000"
+"\u001esq\u0000~\u0000\u001ft\u0000\u0007Createdt\u0000Rhttp://docs.oasis-open.org/wss/2004/01/o"
+"asis-200401-wss-wssecurity-utility-1.0.xsdq\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000~\u0000"
+"\bq\u0000~\u0000\fpsq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00005com.sun.identity.wsfederation.jaxb.wsu.Expir"
+"esElementq\u0000~\u0000#sq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000"
+"~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001fq\u0000~\u0000+q\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0007Expiresq\u0000~\u0000Fq\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000~"
+"\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0015ppq\u0000~\u0000\u0018sr\u0000\'com.sun.msv.grammar.Di"
+"fferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000eL\u0000\u0003nc2q\u0000~\u0000\u000exq\u0000~\u0000\u001bq\u0000~\u0000"
+"\u001csr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~"
+"\u0000\u000eL\u0000\u0003nc2q\u0000~\u0000\u000exq\u0000~\u0000\u001bsr\u0000&com.sun.msv.grammar.NamespaceNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u0000\u0000sq\u0000~\u0000bq\u0000~\u0000Fsq\u0000~\u0000bq\u0000"
+"~\u0000#q\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsq\u0000~\u0000.ppsr\u0000\u001fcom.sun.msv.datatype"
+".xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.NcnameTyp"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwa"
+"ysValidxq\u0000~\u00003q\u0000~\u00008t\u0000\u0002IDq\u0000~\u0000<\u0000q\u0000~\u0000>sq\u0000~\u0000?q\u0000~\u0000oq\u0000~\u00008sq\u0000~\u0000\u001ft\u0000\u0002I"
+"dq\u0000~\u0000Fq\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash"
+";xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c"
+"\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/"
+"ExpressionPool;xp\u0000\u0000\u0000\u0016\u0001pq\u0000~\u0000Zq\u0000~\u0000\u0007q\u0000~\u0000\u0006q\u0000~\u0000,q\u0000~\u0000Vq\u0000~\u0000\u0014q\u0000~\u0000(q\u0000"
+"~\u0000Kq\u0000~\u0000Sq\u0000~\u0000\tq\u0000~\u0000Gq\u0000~\u0000%q\u0000~\u0000Pq\u0000~\u0000\u0011q\u0000~\u0000\'q\u0000~\u0000Jq\u0000~\u0000Rq\u0000~\u0000\u0005q\u0000~\u0000[q\u0000"
+"~\u0000gq\u0000~\u0000\nq\u0000~\u0000Hx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-----------");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsu.impl.TimestampTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  6 :
                        if (("Expires" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            _Expires = ((com.sun.identity.wsfederation.jaxb.wsu.impl.ExpiresElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsu.impl.ExpiresElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Expires" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 9;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  8 :
                        if (!(("" == ___uri)||("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri))) {
                            java.lang.Object co = spawnWildcard(8, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  7 :
                        if (!(("" == ___uri)||("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri))) {
                            java.lang.Object co = spawnWildcard(8, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAny().add(co);
                            }
                            return ;
                        }
                        state = 8;
                        continue outer;
                    case  3 :
                        if (("Created" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            _Created = ((com.sun.identity.wsfederation.jaxb.wsu.impl.CreatedElementImpl) spawnChildFromEnterElement((com.sun.identity.wsfederation.jaxb.wsu.impl.CreatedElementImpl.class), 6, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Created" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            context.pushAttributes(__atts, true);
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
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

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Id = context.addToIdTable(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  10 :
                        if (("Expires" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  8 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  5 :
                        if (("Created" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            context.popAttributes();
                            state = 6;
                            return ;
                        }
                        break;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
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
                    case  0 :
                        if (("Id" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        if (("Id" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            _Created = ((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl.class), 5, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  8 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  9 :
                        if (("Id" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            _Expires = ((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl) spawnChildFromEnterAttribute((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl.class), 10, ___uri, ___local, ___qname));
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
                    case  0 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText1(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  4 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  2 :
                        if (("Id" == ___local)&&("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  8 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  7 :
                        state = 8;
                        continue outer;
                    case  3 :
                        state = 6;
                        continue outer;
                    case  9 :
                        attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
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
                        case  0 :
                            attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText1(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  4 :
                            attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Created = ((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl.class), 5, value));
                            return ;
                        case  6 :
                            state = 7;
                            continue outer;
                        case  8 :
                            revertToParentFromText(value);
                            return ;
                        case  7 :
                            state = 8;
                            continue outer;
                        case  1 :
                            state = 2;
                            eatText1(value);
                            return ;
                        case  3 :
                            state = 6;
                            continue outer;
                        case  9 :
                            attIdx = context.getAttribute("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            _Expires = ((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl) spawnChildFromText((com.sun.identity.wsfederation.jaxb.wsu.impl.AttributedDateTimeImpl.class), 10, value));
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