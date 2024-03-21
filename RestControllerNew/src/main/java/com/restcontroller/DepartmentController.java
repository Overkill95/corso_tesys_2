package com.restcontroller;

import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.provasoap.servicedepartment.Department;
import com.restservice.DipartimentoService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DipartimentoService dipartimentoService;
	
	@RequestMapping(value = "/aggiungiDip", method = RequestMethod.POST, produces = "application/json")
    public void addDepartment(@RequestBody Department department) throws DatatypeConfigurationException {
		dipartimentoService.addDepartment(department);
    }
	
	@RequestMapping(value = "/getDip/{departmentId}", method = RequestMethod.GET, produces = "application/json")
    public Department getDepartmentById(@PathVariable int departmentId) {
		return dipartimentoService.getDepartmentById(departmentId);
    }

	@RequestMapping(value = "/deleteDip/{departmentId}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteDepartment(@PathVariable int departmentId) {
		dipartimentoService.deleteDepartment(departmentId);
    }
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
	public List<Department> getAll(){
		return dipartimentoService.getAllDepartments();
		
	}

	

}
