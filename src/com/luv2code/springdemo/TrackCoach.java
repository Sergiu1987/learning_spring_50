package com.luv2code.springdemo;

public class TrackCoach implements Coach {
    
    public TrackCoach() {}
    
    private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
        super();
        this.fortuneService = fortuneService;
    }

    @Override
	public String getDailyWorkOut() {
		
		return "Run a hard 5k";
	}

    @Override
    public Boolean getYourDailyWorkOut() {
      
        return false;
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return "Just Do It! "+fortuneService.getFortune();
    }

}
