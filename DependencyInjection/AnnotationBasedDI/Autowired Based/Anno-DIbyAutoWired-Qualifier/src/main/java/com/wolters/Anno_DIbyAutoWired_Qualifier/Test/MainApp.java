package com.wolters.Anno_DIbyAutoWired_Qualifier.Test;

import com.wolters.Anno_DIbyAutoWired_Qualifier.pojos.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee emp = (Employee) context.getBean("emp1");
        System.out.println(emp);
    }
}
