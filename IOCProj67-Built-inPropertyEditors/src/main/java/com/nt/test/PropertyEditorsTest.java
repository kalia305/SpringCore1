package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PersonalInfo;

public class PropertyEditorsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonalInfo info=null;
		//create Applicationcontext container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		info=ctx.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		
	}

}
