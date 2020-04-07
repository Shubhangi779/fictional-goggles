package com.infy.model;

import java.util.Date;

public class EmployeeDto {
	
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String designation;
	
	
	public EmployeeDto(long employeeId, String firstName, String lastName, String email, String mobile,String designation) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.designation = designation;
	}
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", mobile=" + mobile + ", designation=" + designation + "]";
	} 
	
}
