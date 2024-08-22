package com.woletrs.SetterInject_NSM.Tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.woletrs.SetterInject_NSM.pojos.Company;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		Company company = (Company) context.getBean("company1");
		company.display();
	}
}
