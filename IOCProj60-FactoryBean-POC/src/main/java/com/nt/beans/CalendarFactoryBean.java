package com.nt.beans;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
	private  int year,month,day;
	

	public CalendarFactoryBean(int year, int month, int day) {
		System.out.println("DateFactoryBean:3-param constructor");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Calendar getObject() throws Exception {
		Calendar calendar=null;
		System.out.println("CalendarFactoryBean.getObject()");
		calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR,year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DATE,day);
		return calendar;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("CalendarFactoryBean.getObjectType(-)");
		return  Calendar.class;
	}
	
	@Override
	public  boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return false;
	}
	

}
