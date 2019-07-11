package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        
        // load the spring configuration file
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach thefootbalCoach = context.getBean("myFootballCoach",Coach.class);
        Coach theTrackCoach = context.getBean("myTrackCoach", Coach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getYourDailyWorkOut());
        System.out.println(thefootbalCoach.getDailyWorkOut());
        System.out.println(thefootbalCoach.getYourDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theTrackCoach.getDailyFortune());
        
        //close the context
        context.close();

    }

}
