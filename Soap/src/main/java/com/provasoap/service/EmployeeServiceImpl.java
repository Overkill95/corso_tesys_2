package com.provasoap.service;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

import com.provasoap.business.DatabaseConnector;
import com.provasoap.model.Employee;

@WebService
public class EmployeeServiceImpl {

    //@Override
    @WebMethod
    public void addEmployee(Employee employee) throws WebServiceException {
    	 
    	String sql = "INSERT INTO Employees_Daniel (first_name, last_name, email, phone_number, hire_date, job_id, salary, manager_id, department_id) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhoneNumber());
        
            // Ottenere la data come oggetto Date
            Date hireDate = employee.getHireDate();

            // Convertire l'oggetto Date in una stringa formattata nel formato corretto
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String hireDateString = dateFormat.format(hireDate);

            // Impostare la stringa formattata come parametro nel PreparedStatement
            statement.setString(5, hireDateString);
           
    
            statement.setInt(6, employee.getJobId());
            statement.setDouble(7, employee.getSalary());
            statement.setInt(8, employee.getManagerId() != null ? employee.getManagerId() : 0);
            statement.setInt(9, employee.getDepartmentId() != null ? employee.getDepartmentId() : 0);

            statement.executeUpdate();
        
        } catch (SQLException | NamingException e) {
            e.printStackTrace();
            throw new WebServiceException(e);
        }
    }



	//@Override
	@WebMethod
	public Employee getEmployeeById(int employeeId) throws WebServiceException {
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
                    Date hireDate = resultSet.getDate("hire_date");
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
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new WebServiceException(e);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new WebServiceException(e);
		}
        return null; 
		
	}


	//@Override
	@WebMethod
	public String deleteEmployee(int employeeId) throws WebServiceException {
	    String sql = "DELETE FROM Employees_Daniel WHERE employee_id = ?";
	    String message;

	    try (Connection connection = DatabaseConnector.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {

	        statement.setInt(1, employeeId);
	        int rowsAffected = statement.executeUpdate();
	        if (rowsAffected > 0) {
	            message = "Employee with ID " + employeeId + " deleted successfully.";
	        } else {
	            message = "No employee found with ID " + employeeId;
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new WebServiceException(e);
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new WebServiceException(e1);
		}

	    return message;
	}
	
	@WebMethod
	public List<Employee> getAll() throws WebServiceException{
		String sql = "SELECT * FROM Employees_Daniel";
		List<Employee> employees = new ArrayList<>();
		
		try(Connection connection = DatabaseConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()){
			
				while (resultSet.next()) {
				Employee employee = new Employee();
				
				employee.setEmployeeId(resultSet.getInt("employee_id"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setEmail(resultSet.getString("email"));
				employee.setPhoneNumber(resultSet.getString("phone_number"));
				employee.setHireDate(resultSet.getDate("hire_date"));
				employee.setJobId(resultSet.getInt("job_id"));
				employee.setSalary(resultSet.getDouble("salary"));
				employee.setManagerId(resultSet.getInt("manager_id"));
				employee.setDepartmentId(resultSet.getInt("department_id"));
				
				employees.add(employee);
				
				}
				
		}catch(SQLException e) {
				 throw new WebServiceException("Error fetching employees: " + e.getMessage(), e);
				
			} catch (NamingException e1) {
			
			e1.printStackTrace();
		}
			
		System.out.println(employees);
			return employees;
			
		}
	
	
}
