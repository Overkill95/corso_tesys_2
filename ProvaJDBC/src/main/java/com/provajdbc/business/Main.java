package com.provajdbc.business;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

import com.provajdbc.dao.EmployeeDao;
import com.provajdbc.dao.EmployeeDaoImpl;
import com.provajdbc.model.Employee;

public class Main {
    public static void main(String[] args) {
        
    	EmployeeDao employeeDao = new EmployeeDaoImpl();
    	
        
//    	//Create
//		
//		  try {
//		  
//		  LocalDate hireDate = LocalDate.of(2012, 10, 10);
//		  
//		  Employee newEmployee = new Employee( "Mirko", "Micheli",
//		  "Mirko.Mich@example.com", "123-456-7890", hireDate, 10, 50000.00, 123, 11 );
//		  
//		  employeeDao.insertEmployee(newEmployee);
//		  System.out.println("Dipendente inserito con successo"); } catch (SQLException
//		  e) { e.printStackTrace(); }
//		 
//    	 
//    	 
//    	 //Delete
//    	 try {
//			employeeDao.deleteEmployee(211);
//		
//		} catch (SQLException e) {
//			System.out.println("Nessun è stato possibile elimare il dipendente");
//			e.printStackTrace();
//		}
//    	 
//    	 
//    	 //Read
//    	 try {
//			employeeDao.getEmployeeById(209);
//			
//			
//		} catch (SQLException e) {
//			System.out.println("Nessun è stato possibile elimare il dipendente");
//			e.printStackTrace();
//		}
//    	
//    	 
//    	 try {
//    		 
//    		 employeeDao.updateEmployeeById(216,"dmscoaco");
//    		 
//    	 } catch(SQLException e) {
// 			System.out.println("Nessun è stato possibile elimare il dipendente");
// 			e.printStackTrace();
// 		}
     	
    	
    	
    	try {
            List<Employee> listaEmployee = employeeDao.elencoEmployee();
            System.out.println("Elenco dipendenti:");
            for (Employee dipendente : listaEmployee) {
                System.out.println(dipendente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    	 
    	 
    }
}
