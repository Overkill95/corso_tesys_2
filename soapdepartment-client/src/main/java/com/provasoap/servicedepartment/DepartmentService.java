
package com.provasoap.servicedepartment;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DepartmentService", targetNamespace = "http://servicedepartment.provasoap.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DepartmentService {


    /**
     * 
     * @param department
     * @return
     *     returns java.util.List<com.provasoap.servicedepartment.Department>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.GetAllResponse")
    @Action(input = "http://servicedepartment.provasoap.com/DepartmentService/getAllRequest", output = "http://servicedepartment.provasoap.com/DepartmentService/getAllResponse")
    public List<Department> getAll();

    /**
     * 
     * @param departmentId
     * @return
     *     returns com.provasoap.servicedepartment.Department
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDepartmentById", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.GetDepartmentById")
    @ResponseWrapper(localName = "getDepartmentByIdResponse", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.GetDepartmentByIdResponse")
    @Action(input = "http://servicedepartment.provasoap.com/DepartmentService/getDepartmentByIdRequest", output = "http://servicedepartment.provasoap.com/DepartmentService/getDepartmentByIdResponse")
    public Department getDepartmentById(
        @WebParam(name = "departmentId", targetNamespace = "")
        int departmentId);

    /**
     * 
     * @param departmentId
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDepartment", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.DeleteDepartment")
    @ResponseWrapper(localName = "deleteDepartmentResponse", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.DeleteDepartmentResponse")
    @Action(input = "http://servicedepartment.provasoap.com/DepartmentService/deleteDepartmentRequest", output = "http://servicedepartment.provasoap.com/DepartmentService/deleteDepartmentResponse")
    public String deleteDepartment(
        @WebParam(name = "departmentId", targetNamespace = "")
        int departmentId);

    /**
     * 
     * @param department
     */
    @WebMethod
    @RequestWrapper(localName = "addDepartment", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.AddDepartment")
    @ResponseWrapper(localName = "addDepartmentResponse", targetNamespace = "http://servicedepartment.provasoap.com/", className = "com.provasoap.servicedepartment.AddDepartmentResponse")
    @Action(input = "http://servicedepartment.provasoap.com/DepartmentService/addDepartmentRequest", output = "http://servicedepartment.provasoap.com/DepartmentService/addDepartmentResponse")
    public void addDepartment(
        @WebParam(name = "department", targetNamespace = "")
        Department department);

}
