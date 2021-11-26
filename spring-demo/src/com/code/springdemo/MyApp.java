package com.code.springdemo;

public class MyApp {

	public static void main(String[] args) {
			Coach theCoach = new BaseballCoach();
			System.out.println(theCoach.getDailyWorkout());
			
			Coach theCoach1 = new TennisCoach();
			System.out.println(theCoach1.getDailyWorkout());
	}

}
