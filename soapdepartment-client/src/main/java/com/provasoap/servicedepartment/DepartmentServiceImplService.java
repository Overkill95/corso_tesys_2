
package com.provasoap.servicedepartment;

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
@WebServiceClient(name = "DepartmentServiceImplService", targetNamespace = "http://servicedepartment.provasoap.com/", wsdlLocation = "file:/C:/Users/Utente/AppData/Local/Temp/tempdir4773334163301106724.tmp/wsdepartment_1.wsdl")
public class DepartmentServiceImplService
    extends Service
{

    private final static URL DEPARTMENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DEPARTMENTSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DEPARTMENTSERVICEIMPLSERVICE_QNAME = new QName("http://servicedepartment.provasoap.com/", "DepartmentServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Utente/AppData/Local/Temp/tempdir4773334163301106724.tmp/wsdepartment_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DEPARTMENTSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DEPARTMENTSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DepartmentServiceImplService() {
        super(__getWsdlLocation(), DEPARTMENTSERVICEIMPLSERVICE_QNAME);
    }

    public DepartmentServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DEPARTMENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public DepartmentServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DEPARTMENTSERVICEIMPLSERVICE_QNAME);
    }

    public DepartmentServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DEPARTMENTSERVICEIMPLSERVICE_QNAME, features);
    }

    public DepartmentServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DepartmentServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DepartmentService
     */
    @WebEndpoint(name = "DepartmentServiceImplPort")
    public DepartmentService getDepartmentServiceImplPort() {
        return super.getPort(new QName("http://servicedepartment.provasoap.com/", "DepartmentServiceImplPort"), DepartmentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DepartmentService
     */
    @WebEndpoint(name = "DepartmentServiceImplPort")
    public DepartmentService getDepartmentServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicedepartment.provasoap.com/", "DepartmentServiceImplPort"), DepartmentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DEPARTMENTSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DEPARTMENTSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DEPARTMENTSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
