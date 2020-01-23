package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class BeanCollabarationTest1 {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target class object
		/*fpkt=factory.getBean("fpkt",Flipkart.class);
		//invoke method
		System.out.println(fpkt.shopping(new String[] {"shirt","trouser", "sweets","crackers"},
				                                                        new float[] {2000,3000,1000,5000}));*/
		
	}

}
