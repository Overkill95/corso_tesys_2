
package com.provasoap.servicedepartment;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.provasoap.servicedepartment package. 
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

    private final static QName _GetAllResponse_QNAME = new QName("http://servicedepartment.provasoap.com/", "getAllResponse");
    private final static QName _DeleteDepartmentResponse_QNAME = new QName("http://servicedepartment.provasoap.com/", "deleteDepartmentResponse");
    private final static QName _GetDepartmentById_QNAME = new QName("http://servicedepartment.provasoap.com/", "getDepartmentById");
    private final static QName _AddDepartmentResponse_QNAME = new QName("http://servicedepartment.provasoap.com/", "addDepartmentResponse");
    private final static QName _AddDepartment_QNAME = new QName("http://servicedepartment.provasoap.com/", "addDepartment");
    private final static QName _GetAll_QNAME = new QName("http://servicedepartment.provasoap.com/", "getAll");
    private final static QName _GetDepartmentByIdResponse_QNAME = new QName("http://servicedepartment.provasoap.com/", "getDepartmentByIdResponse");
    private final static QName _DeleteDepartment_QNAME = new QName("http://servicedepartment.provasoap.com/", "deleteDepartment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.provasoap.servicedepartment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDepartmentByIdResponse }
     * 
     */
    public GetDepartmentByIdResponse createGetDepartmentByIdResponse() {
        return new GetDepartmentByIdResponse();
    }

    /**
     * Create an instance of {@link AddDepartmentResponse }
     * 
     */
    public AddDepartmentResponse createAddDepartmentResponse() {
        return new AddDepartmentResponse();
    }

    /**
     * Create an instance of {@link AddDepartment }
     * 
     */
    public AddDepartment createAddDepartment() {
        return new AddDepartment();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link DeleteDepartmentResponse }
     * 
     */
    public DeleteDepartmentResponse createDeleteDepartmentResponse() {
        return new DeleteDepartmentResponse();
    }

    /**
     * Create an instance of {@link GetDepartmentById }
     * 
     */
    public GetDepartmentById createGetDepartmentById() {
        return new GetDepartmentById();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link DeleteDepartment }
     * 
     */
    public DeleteDepartment createDeleteDepartment() {
        return new DeleteDepartment();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDepartmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "deleteDepartmentResponse")
    public JAXBElement<DeleteDepartmentResponse> createDeleteDepartmentResponse(DeleteDepartmentResponse value) {
        return new JAXBElement<DeleteDepartmentResponse>(_DeleteDepartmentResponse_QNAME, DeleteDepartmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "getDepartmentById")
    public JAXBElement<GetDepartmentById> createGetDepartmentById(GetDepartmentById value) {
        return new JAXBElement<GetDepartmentById>(_GetDepartmentById_QNAME, GetDepartmentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDepartmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "addDepartmentResponse")
    public JAXBElement<AddDepartmentResponse> createAddDepartmentResponse(AddDepartmentResponse value) {
        return new JAXBElement<AddDepartmentResponse>(_AddDepartmentResponse_QNAME, AddDepartmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDepartment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "addDepartment")
    public JAXBElement<AddDepartment> createAddDepartment(AddDepartment value) {
        return new JAXBElement<AddDepartment>(_AddDepartment_QNAME, AddDepartment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartmentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "getDepartmentByIdResponse")
    public JAXBElement<GetDepartmentByIdResponse> createGetDepartmentByIdResponse(GetDepartmentByIdResponse value) {
        return new JAXBElement<GetDepartmentByIdResponse>(_GetDepartmentByIdResponse_QNAME, GetDepartmentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDepartment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicedepartment.provasoap.com/", name = "deleteDepartment")
    public JAXBElement<DeleteDepartment> createDeleteDepartment(DeleteDepartment value) {
        return new JAXBElement<DeleteDepartment>(_DeleteDepartment_QNAME, DeleteDepartment.class, null, value);
    }

}
