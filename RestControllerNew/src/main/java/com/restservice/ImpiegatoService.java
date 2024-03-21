package com.restservice;


import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.ws.BindingProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.provasoap.service.Employee;
import com.provasoap.service.EmployeeServiceImpl;
import com.provasoap.service.EmployeeServiceImplService;





@Service
public class ImpiegatoService {
	
	 @Value("${employee.soap.endpoint}")
	  private String endpoint;
	 
	 EmployeeServiceImplService empService = new EmployeeServiceImplService();
	 EmployeeServiceImpl port = empService.getEmployeeServiceImplPort();
		
	 BindingProvider bp = (BindingProvider)port;
	

	public void addEmployee(Employee employee) throws DatatypeConfigurationException {
		
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		port.addEmployee(employee);
		
	}

	public Employee getEmployeeById(int employeeId) {
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.getEmployeeById(employeeId);
	}

	public String deleteEmployee(int employeeId) {
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.deleteEmployee(employeeId);
	}
	
	public List<Employee> getAllEmployee(){
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, this.endpoint);
		return port.getAll();
	}

}
