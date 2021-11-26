package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifecycleDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		context.close();

		
		
		
	}

}
