package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empID;
	private String empName;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Employee(){
		System.out.println("Employee Details");
	}
	void print() {
		System.out.println("Employee of IT Dept");
		
	}

}
