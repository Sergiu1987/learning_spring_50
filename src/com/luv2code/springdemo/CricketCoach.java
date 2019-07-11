package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    
    private String team;
    private String emailAddress;
    
    private FortuneService fortuneService;
    
    public CricketCoach() {
        System.out.println("CricketCOach: inside no-args constructor");
    }
    
    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public Boolean getYourDailyWorkOut() {
        return true;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
