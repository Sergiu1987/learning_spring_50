package com.luv2code.springdemo;

public class GolfCoach implements Coach {
    
    private FortuneService fortuneService;
    
    
    
    public GolfCoach() {
        super();
    }

    public GolfCoach(FortuneService theFortuneService) {
        super();
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {


        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public Boolean getYourDailyWorkOut() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String getDailyFortune() {
       
        return fortuneService.getFortune();
    }

}
