package com.nestjavatraining.springfoundation;

public class HockeyCoach extends CoachImpl {
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 100 Squad in Hockey ground";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "HockeyCoach [getDailyWorkout()=" + getDailyWorkout() + ", getDailyFortune()=" + getDailyFortune() + "]";
	}
	
}
