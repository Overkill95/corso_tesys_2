package com.provasoap.service;

import javax.naming.NamingException;

import com.provasoap.model.Employee;

import java.sql.SQLException;


public interface EmployeeService {

    
    void addEmployee(Employee employee) throws NamingException;

    Employee getEmployeeById(int employeeId) throws SQLException, NamingException;

    void deleteEmployee(int employeeId) throws SQLException, NamingException;
   
   
//  @WebMethod
//    void updateEmployee(@WebParam(name = "employee") Employee employee);
  
  
//    @WebMethod
//    List<Employee> getAllEmployees();
}
