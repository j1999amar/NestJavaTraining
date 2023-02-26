package com.experion.springdemo;

public class CricketCoach implements Coach {
	
	
	private String emailaddress;
	private String teamname;
	private FortuneService fortuneService;
	
    public String getEmailaddress() {
	return emailaddress;
    }


	public void setEmailaddress(String emailaddress) {
		System.out.println("Inside setter method setemailaddress");
		this.emailaddress = emailaddress;
	}


	public String getTeamname() {
		return teamname;
	}


	public void setTeamname(String teamname) {
		System.out.println("Inside setter method setTeamName");
		this.teamname = teamname;
	}
	
	public CricketCoach() {
		
		System.out.println("Inside CricketCoach Construcctor");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		
		
		return"Spend 30 minutes on circket practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
