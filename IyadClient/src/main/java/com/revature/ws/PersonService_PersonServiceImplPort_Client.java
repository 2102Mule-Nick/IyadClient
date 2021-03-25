
package com.revature.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2021-03-25T17:41:56.806-04:00
 * Generated source version: 3.3.0
 *
 */
public final class PersonService_PersonServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.revature.com/", "personService");

    private PersonService_PersonServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = PersonService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        PersonService_Service ss = new PersonService_Service(wsdlURL, SERVICE_NAME);
        PersonService port = ss.getPersonServiceImplPort();

        {
        System.out.println("Invoking addPerson...");
        com.revature.ws.Person _addPerson_arg0 = new com.revature.ws.Person();
        java.lang.String _addPerson__return = port.addPerson(_addPerson_arg0);
        System.out.println("addPerson.result=" + _addPerson__return);


        }
        {
        System.out.println("Invoking updatePersonName...");
        com.revature.ws.Person _updatePersonName_arg0 = new com.revature.ws.Person();
        java.lang.String _updatePersonName_arg1 = "";
        java.lang.String _updatePersonName__return = port.updatePersonName(_updatePersonName_arg0, _updatePersonName_arg1);
        System.out.println("updatePersonName.result=" + _updatePersonName__return);


        }
        {
        System.out.println("Invoking updateAge...");
        com.revature.ws.Person _updateAge_arg0 = new com.revature.ws.Person();
        int _updateAge_arg1 = 0;
        boolean _updateAge__return = port.updateAge(_updateAge_arg0, _updateAge_arg1);
        System.out.println("updateAge.result=" + _updateAge__return);


        }

        System.exit(0);
    }

}