package com.provasoap.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private Integer jobId;
    private double salary;
    private Integer managerId;
    private Integer departmentId;

   
    public Employee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
                    Date hireDate,Integer jobId, double salary, Integer managerId, Integer departmentId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.salary = salary;
        this.managerId = managerId;
        this.departmentId = departmentId;
    }
    

    public Employee( String firstName, String lastName, String email, String phoneNumber,
            Date hireDate, Integer jobId, double salary, Integer managerId, Integer departmentId) {

this.firstName = firstName;
this.lastName = lastName;
this.email = email;
this.phoneNumber = phoneNumber;
this.hireDate = hireDate;
this.jobId = jobId;
this.salary = salary;
this.managerId = managerId;
this.departmentId = departmentId;
}
    
    public Employee() {
    	
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

  
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hireDate=" + hireDate +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                ", managerId=" + managerId +
                ", departmentId=" + departmentId +
                '}';
    }


	@Override
	public int hashCode() {
		return Objects.hash(departmentId, email, employeeId, firstName, hireDate, jobId, lastName, managerId,
				phoneNumber, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(departmentId, other.departmentId) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hireDate, other.hireDate) && Objects.equals(jobId, other.jobId)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(managerId, other.managerId)
				&& Objects.equals(phoneNumber, other.phoneNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	 public String getFormattedHireDate() {
	        if (hireDate == null) {
	            return null;
	        }
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        return dateFormat.format(hireDate);
	    }

	   
	    public void setFormattedHireDate(String formattedDate) {
	        try {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            this.hireDate = new Date(dateFormat.parse(formattedDate).getTime());
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	            
	        }
	    }
    
    
}

