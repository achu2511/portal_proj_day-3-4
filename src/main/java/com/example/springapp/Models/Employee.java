package com.example.springapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String EmployeeName;
	private int EmployeeAge;
	private int salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String employeeName, int employeeAge, int salary) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
		this.salary = salary;
	}
	
	
	
}
