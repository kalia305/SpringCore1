package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class TraditionalDLTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle  vehicle=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target Bean class object
		vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invoke the methods
		vehicle.journey("hyd","goa");
		vehicle.soundHorn();
		vehicle.entertaiment();
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
