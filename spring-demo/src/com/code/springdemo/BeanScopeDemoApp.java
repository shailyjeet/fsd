package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(" Pointing to the same object " + result);
		
		System.out.println(" Memory location of theCoach " + theCoach);
		
		System.out.println(" Memory location of alphaCoach " + alphaCoach);
		
		context.close();

		
		
		
	}

}
