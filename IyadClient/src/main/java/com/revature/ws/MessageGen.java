package com.revature.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2021-03-25T17:41:56.467-04:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://ws.revature.com/", name = "MessageGen")
@XmlSeeAlso({ObjectFactory.class})
public interface MessageGen {

    @WebMethod
    @RequestWrapper(localName = "getAnotherMessage", targetNamespace = "http://ws.revature.com/", className = "com.revature.ws.GetAnotherMessage")
    @ResponseWrapper(localName = "getAnotherMessageResponse", targetNamespace = "http://ws.revature.com/", className = "com.revature.ws.GetAnotherMessageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getAnotherMessage();

    @WebMethod
    @RequestWrapper(localName = "getMessage", targetNamespace = "http://ws.revature.com/", className = "com.revature.ws.GetMessage")
    @ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://ws.revature.com/", className = "com.revature.ws.GetMessageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getMessage();
}
