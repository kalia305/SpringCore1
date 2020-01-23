package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date  date;

	public ScheduleRemainder(Date date) {
		this.date = date;
	}
	
	 public   String  showTodaysAppoinments() {
		 Date sysDate=new Date();
		 
		 if(date.getYear()==sysDate.getYear() && date.getMonth()==sysDate.getMonth() && date.getDate()==sysDate.getDate())
			 return "Doctor Appoinment ";
		 else
			 return "No Appoinments today ";
	 }

}
