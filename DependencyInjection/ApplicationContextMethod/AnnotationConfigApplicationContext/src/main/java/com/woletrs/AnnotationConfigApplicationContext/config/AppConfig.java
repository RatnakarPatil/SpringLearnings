package com.woletrs.AnnotationConfigApplicationContext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.woletrs.AnnotationConfigApplicationContext.pojos.Student;

@Configuration
public class AppConfig {
	
	@Bean
	public Student student()
	{
		return new Student(1,"Ram");
	}
}





