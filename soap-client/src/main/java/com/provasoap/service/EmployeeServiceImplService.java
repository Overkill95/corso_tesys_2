
package com.provasoap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmployeeServiceImplService", targetNamespace = "http://service.provasoap.com/", wsdlLocation = "file:/C:/Users/Utente/AppData/Local/Temp/tempdir138835182937676462.tmp/wssoap_1.wsdl")
public class EmployeeServiceImplService
    extends Service
{

    private final static URL EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLOYEESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EMPLOYEESERVICEIMPLSERVICE_QNAME = new QName("http://service.provasoap.com/", "EmployeeServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Utente/AppData/Local/Temp/tempdir138835182937676462.tmp/wssoap_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EMPLOYEESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EmployeeServiceImplService() {
        super(__getWsdlLocation(), EMPLOYEESERVICEIMPLSERVICE_QNAME);
    }

    public EmployeeServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLOYEESERVICEIMPLSERVICE_QNAME, features);
    }

    public EmployeeServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EMPLOYEESERVICEIMPLSERVICE_QNAME);
    }

    public EmployeeServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLOYEESERVICEIMPLSERVICE_QNAME, features);
    }

    public EmployeeServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmployeeServiceImpl
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeServiceImpl getEmployeeServiceImplPort() {
        return super.getPort(new QName("http://service.provasoap.com/", "EmployeeServiceImplPort"), EmployeeServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeeServiceImpl
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeServiceImpl getEmployeeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.provasoap.com/", "EmployeeServiceImplPort"), EmployeeServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLOYEESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EMPLOYEESERVICEIMPLSERVICE_EXCEPTION;
        }
        return EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
