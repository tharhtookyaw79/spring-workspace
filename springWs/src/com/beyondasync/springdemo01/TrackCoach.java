package com.beyondasync.springdemo01;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it " + fortuneService.getFortune();
	}

}
