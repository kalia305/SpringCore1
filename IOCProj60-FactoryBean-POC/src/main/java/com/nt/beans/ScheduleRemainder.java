package com.nt.beans;

import java.util.Calendar;

public class ScheduleRemainder {
	private Calendar  date;

	public ScheduleRemainder(Calendar date) {
		this.date = date;
	}
	
	 public   String  showTodaysAppoinments() {
		 Calendar sysDate=Calendar.getInstance();
		 System.out.println(date);
		 System.out.println(sysDate);
		 
		 if(date.get(Calendar.YEAR)==sysDate.get(Calendar.YEAR) && date.get(Calendar.MONTH)==sysDate.get(Calendar.MONTH) && date.get(Calendar.DATE)==sysDate.get(Calendar.DATE))
			 return "Doctor Appoinment ....";
		 else
			 return "No Appoinments today ";
	 }

}
