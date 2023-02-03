package com.beyondasync.springdemo01;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
