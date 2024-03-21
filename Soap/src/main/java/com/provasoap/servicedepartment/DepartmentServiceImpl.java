package com.provasoap.servicedepartment;

import com.provasoap.business.DatabaseConnector;
import com.provasoap.model.Department;
import com.provasoap.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.naming.NamingException;
import javax.xml.ws.WebServiceException;

@WebService(endpointInterface = "com.provasoap.servicedepartment.DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public Department getDepartmentById(int departmentId) {
    	
    	String sql = "SELECT * FROM Departments_Daniel WHERE department_id = ?";
        
        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setInt(1, departmentId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                   
                	
                    Integer departId1 = resultSet.getInt("department_id");
                    String departmentName = resultSet.getString("department_name");
                    Integer locationId = resultSet.getInt("location_id");
                    
                    Department dipartimento = new Department(departId1,departmentName,locationId);
                    
                    System.out.println(dipartimento);
                    
                    return dipartimento;
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

    @Override
    public void addDepartment(Department department) {
    	String sql = "INSERT INTO Departments_Daniel (department_name, location_id) " +
                "VALUES (?, ?)";
       
       try (Connection connection = DatabaseConnector.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {

           
           statement.setString(1, department.getDepartmentName());
           statement.setInt(2, department.getLocationId());
          
     
           statement.executeUpdate();
       
       } catch (SQLException | NamingException e) {
           e.printStackTrace();
           throw new WebServiceException(e);
       }
    }

   

    @Override
    public String deleteDepartment(int departmentId) {
    	String sql = "DELETE FROM Departments_Daniel WHERE department_id = ?";
	    String message;

	    try (Connection connection = DatabaseConnector.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {

	        statement.setInt(1, departmentId);
	        int rowsAffected = statement.executeUpdate();
	        if (rowsAffected > 0) {
	            message = "Department with ID " + departmentId + " deleted successfully.";
	        } else {
	            message = "No department found with ID " + departmentId;
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

	@Override
	public List<Department> getAll() {
		String sql = "SELECT * FROM Departments_Daniel";
		List<Department> departments = new ArrayList<>();
		
		try(Connection connection = DatabaseConnector.getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery()){
			
				while (resultSet.next()) {
					Department department= new Department();
				
				
				department.setDepartmentId(resultSet.getInt("department_id"));
				department.setDepartmentName(resultSet.getString("department_name"));
				department.setLocationId(resultSet.getInt("location_id"));
				
				departments.add(department);
				
				}
				
		}catch(SQLException e) {
				 throw new WebServiceException("Error fetching employees: " + e.getMessage(), e);
				
			} catch (NamingException e1) {
			
			e1.printStackTrace();
		}
			
		System.out.println(departments);
			return departments;
			
		}

	

}

	
	
    
    
    

