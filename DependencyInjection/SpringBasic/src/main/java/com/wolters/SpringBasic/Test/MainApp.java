package com.wolters.SpringBasic.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolters.SpringBasic.pojos.Employee;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee emp = (Employee) context.getBean("employee1");
		emp.display();
	}
}