package com.provajdbc.dao;

import com.provajdbc.business.DatabaseConnector;
import com.provajdbc.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao{

    
	@Override
    public void insertEmployee(Employee employee) throws SQLException {
        
    	 String sql = "INSERT INTO Employees_Daniel (first_name, last_name, email, phone_number, hire_date, job_id, salary, manager_id, department_id) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhoneNumber());
            statement.setObject(5, employee.getHireDate());
            statement.setInt(6, employee.getJobId());
            statement.setDouble(7, employee.getSalary());
            statement.setInt(8, employee.getManagerId() != null ? employee.getManagerId() : 0);
            statement.setInt(9, employee.getDepartmentId() != null ? employee.getDepartmentId() : 0);

            statement.executeUpdate();
        }
    }

    @Override
    public void deleteEmployee(int employeeId) throws SQLException {
        
    	String sql = "DELETE FROM Employees_Daniel WHERE employee_id = ?";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, employeeId);
            statement.executeUpdate();
        	}
        }
      
    @Override
    public Employee getEmployeeById(int employeeId) throws SQLException {
        
    	String sql = "SELECT * FROM Employees_Daniel WHERE employee_id = ?";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, employeeId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                   
                	int empId = resultSet.getInt("employee_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phone_number");
                    LocalDate hireDate = resultSet.getDate("hire_date").toLocalDate();
                    int jobId = resultSet.getInt("job_id");
                    double salary = resultSet.getDouble("salary");
                    Integer managerId = resultSet.getInt("manager_id");
                    Integer departmentId = resultSet.getInt("department_id");
                    
                    Employee dipendente = new Employee(empId, firstName, lastName, email, phoneNumber,
                            hireDate, jobId, salary, managerId, departmentId);
                    
                    System.out.println(dipendente);
                    
                    return dipendente;
                }
            }
        }
        return null; 
    }
    
    @Override
    public Employee updateEmployeeById(int employeeId, String firstName) throws SQLException {
        String sql = "UPDATE employees_Daniel SET first_name = ? WHERE employee_id = ?";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, firstName);
            statement.setInt(2, employeeId);

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                
                return getEmployeeById(employeeId);
            } else {
              
                return null;
            }
        }
    }


	@Override
	public List<Employee> elencoEmployee() throws SQLException {
		
	String sql = "SELECT * FROM Employees_Daniel";
	 List<Employee> listaEmployee = new ArrayList<>();
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
            	ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()){
            
                	int empId = resultSet.getInt("employee_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phone_number");
                    LocalDate hireDate = resultSet.getDate("hire_date").toLocalDate();
                    int jobId = resultSet.getInt("job_id");
                    double salary = resultSet.getDouble("salary");
                    Integer managerId = resultSet.getInt("manager_id");
                    Integer departmentId = resultSet.getInt("department_id");
		
                    Employee dipendente = new Employee(empId, firstName, lastName, email, phoneNumber,
                            hireDate, jobId, salary, managerId, departmentId);
                    
                    listaEmployee.add(dipendente);
                   
                }
               }
        
           return listaEmployee;
	}

  
}

