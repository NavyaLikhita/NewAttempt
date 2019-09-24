package com.cg.springcore.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("emp")
public class Employee {
	
	@Value("ABC")
	private String empName;
	@Autowired
	private Project myPro;
	
	
	public Project getMyPro() {
		return myPro;
	}


	public void setMyPro(Project myPro) {
		this.myPro = myPro;
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void getData() {
		
		System.out.println("Hii.....!!!!!"+this.empName+" "+myPro.getProjId());
		
	}

	
	
	
	
	

}
