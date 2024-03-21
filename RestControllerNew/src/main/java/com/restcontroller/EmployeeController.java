package com.restcontroller;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.provasoap.service.Employee;
import com.restservice.ImpiegatoService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private ImpiegatoService employeeService;
	
	@RequestMapping(value = "/aggiungiImpiegato", method = RequestMethod.POST, produces = "application/json")
    public void addEmployee(@RequestBody Employee employee) throws DatatypeConfigurationException {
		employeeService.addEmployee(employee);
    }

	@RequestMapping(value = "/getImpiegato/{employeeId}", method = RequestMethod.GET, produces = "application/json")
    public Employee getEmployeeById(@PathVariable int employeeId) {
		return employeeService.getEmployeeById(employeeId);
    }

	@RequestMapping(value = "/deleteImpiegato/{employeeId}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteEmployee(@PathVariable int employeeId) {
		employeeService.deleteEmployee(employeeId);
    }
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
		
	}
}

