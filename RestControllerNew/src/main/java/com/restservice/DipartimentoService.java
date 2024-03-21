package com.restservice;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.provasoap.servicedepartment.Department;
import com.provasoap.servicedepartment.DepartmentService;
import com.provasoap.servicedepartment.DepartmentServiceImplService;


@Service
public class DipartimentoService {
	
	@Value("${department.soap.endpoint}")
	  private String endpoint;
	
	DepartmentServiceImplService depService= new DepartmentServiceImplService();
	DepartmentService port = depService.getDepartmentServiceImplPort();
	
	BindingProvider bp = (BindingProvider)port;
	
	public void addDepartment(Department department) throws DatatypeConfigurationException {
		
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		port.addDepartment(department);
		
	}

	public Department getDepartmentById(int departmentId) {
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.getDepartmentById(departmentId);
	}

	public String deleteDepartment(int departmentId) {
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.deleteDepartment(departmentId);
	}
	
	public List<Department> getAllDepartments(){
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.getAll();
	}

	

}
