package com.code.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach() {
		
	}
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	// add init method
	
	public void domyStartupStuff() {
		System.out.println("Tennis Coach : Init method");
		
	}
	
	// add destroy method
	
	public void domyCleanupStuff() {
		System.out.println("destroy method");
		
	}
	

}





