package com.provasoap.servicedepartment;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.provasoap.model.Department;

@WebService
public interface DepartmentService {
	
	  @WebMethod
	    Department getDepartmentById(@WebParam(name = "departmentId") int departmentId);

	    @WebMethod
	    void addDepartment(@WebParam(name = "department") Department department);

	    @WebMethod
	    public List<Department> getAll();

	    @WebMethod
	   String deleteDepartment(@WebParam(name = "departmentId") int departmentId);

	

}
