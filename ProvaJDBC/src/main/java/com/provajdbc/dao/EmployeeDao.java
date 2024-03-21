package com.provajdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.provajdbc.model.Employee;

public interface EmployeeDao {
	
	 public void insertEmployee(Employee employee) throws SQLException;
	 public void deleteEmployee(int employeeId) throws SQLException;
	 List<Employee> elencoEmployee() throws SQLException;
	 public Employee getEmployeeById(int employeeId) throws SQLException;
	 public Employee updateEmployeeById(int employeeId, String firstName) throws SQLException;

}
