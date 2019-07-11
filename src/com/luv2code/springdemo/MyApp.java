package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the object
		Coach theCoach_Track = new TrackCoach();
		Coach theCoach_Baseball = new BaseballCoach();
		

		// use the object
		System.out.println(theCoach_Track.getDailyWorkOut());
		System.out.println(theCoach_Baseball.getDailyWorkOut());
	}

}
