package com.cg.labbook1.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.labbook1.service.Employee;

import org.springframework.context.ApplicationContext;
public class LabBook1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app=new ClassPathXmlApplicationContext("labbook.xml");
		
		Employee emp=(Employee) app.getBean("emp");
		
		emp.show();
		
	}

}
