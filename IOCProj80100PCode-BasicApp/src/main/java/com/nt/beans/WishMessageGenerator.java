package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	@Qualifier("createCalendar1")
	private Calendar calendar;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
	
	public  String  generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage(-)");
		int hour=0;
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generates wish message
		 if(hour<12)
			 return "Good Morning::"+user;
		 else if(hour<16)
			  return "Good Afternoon::"+user;
		 else if(hour<20)
			 return "Good evening::"+user;
		 else
			 return "Good Night n::"+user;
	}
	

}
