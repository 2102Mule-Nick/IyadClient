
package com.revature.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTestingMessage_QNAME = new QName("http://ws.revature.com/", "getTestingMessage");
    private final static QName _GetTestingMessageResponse_QNAME = new QName("http://ws.revature.com/", "getTestingMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTestingMessage }
     * 
     */
    public GetTestingMessage createGetTestingMessage() {
        return new GetTestingMessage();
    }

    /**
     * Create an instance of {@link GetTestingMessageResponse }
     * 
     */
    public GetTestingMessageResponse createGetTestingMessageResponse() {
        return new GetTestingMessageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestingMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTestingMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getTestingMessage")
    public JAXBElement<GetTestingMessage> createGetTestingMessage(GetTestingMessage value) {
        return new JAXBElement<GetTestingMessage>(_GetTestingMessage_QNAME, GetTestingMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestingMessageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTestingMessageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getTestingMessageResponse")
    public JAXBElement<GetTestingMessageResponse> createGetTestingMessageResponse(GetTestingMessageResponse value) {
        return new JAXBElement<GetTestingMessageResponse>(_GetTestingMessageResponse_QNAME, GetTestingMessageResponse.class, null, value);
    }

}
