package com.cg.springcore.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.service.Department;
import com.cg.springcore.service.Employee;
import com.cg.springcore.service.Project;

public class MyMainClass {

	public static void main(String[] args) {
		

		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee data=(Employee)app.getBean("emp");
		data.getData();
		
		
		
		
	}

}
