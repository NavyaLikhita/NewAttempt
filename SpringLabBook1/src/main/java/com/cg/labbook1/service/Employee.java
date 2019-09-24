package com.cg.labbook1.service;

public class Employee {

	
	private int empId;
	private String empName;
	private Double empSalary;
	private String bu;
	private int empAge;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int empId, String empName, Double empSalary, String bu, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.bu = bu;
		this.empAge = empAge;
	}

	


	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public Double getEmpSalary() {
		return empSalary;
	}



	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}



	public String getBu() {
		return bu;
	}



	public void setBu(String bu) {
		this.bu = bu;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public void show() {
		
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee Id "+empId);
		System.out.println("Employee Name "+empName);
		System.out.println("Employee Salary "+empSalary);
		System.out.println("Employee BU "+bu);
		System.out.println("Employee Age "+empAge);
		
		
		
	}
	
	
	
}
