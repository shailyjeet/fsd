package com.code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	
	
	
	
	public CricketCoach() {
		System.out.println("CricketCOach: inside no arg constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCOach: inside setter method");
		this.fortuneService = fortuneService;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCOach: inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCOach: inside setter method for setTeam");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
