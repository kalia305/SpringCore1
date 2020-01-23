package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		 
         ApplicationContext ctx=null;
		 Object obj=null,obj1=null;
		 WishMessageGenerator generator=null;
		//create IOC container
		// ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		 //ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		 //get Target Bean class object
		 generator=ctx.getBean("wmg",WishMessageGenerator.class);
		 //invoke b.method
		 System.out.println("result:::"+generator.generateMessage("raja")); 
		//close container
		 ((AbstractApplicationContext) ctx).close();

	}

}
