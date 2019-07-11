package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
    
    public BaseballCoach() {}
    
    //define private field for the dependency
    private FortuneService fortuneService;
    
    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
     fortuneService = theFortuneService;    
    } 
	
	@Override	
	public String getDailyWorkOut() {
		
		return "Spend 30 minutes on batting practice";					
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
