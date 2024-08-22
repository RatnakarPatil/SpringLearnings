package com.woletrs.beanDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woletrs.beanDemo.pojos.Student;

@SpringBootApplication
public class BeanDemoApplication {

	public static void main(String[] args) {
		BeanFactory factory =  new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) factory.getBean("student1");
		System.out.println(student);
	}
}