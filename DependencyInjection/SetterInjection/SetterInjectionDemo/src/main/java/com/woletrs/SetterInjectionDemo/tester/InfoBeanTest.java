package com.woletrs.SetterInjectionDemo.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woletrs.SetterInjectionDemo.pojos.InfoBean;

public class InfoBeanTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		InfoBean infoBean = (InfoBean) context.getBean("InfoBean1");
		infoBean.display();
	}
}

