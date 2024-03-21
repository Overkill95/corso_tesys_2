package com.provasoap.model;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private int locationId;
	
	public Department(int departmentId, String departmentName,int locationId) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.locationId = locationId;
		
	}
	
	public Department() {
		
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	

}
