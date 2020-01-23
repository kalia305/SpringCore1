package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Bike bike1=null,bike2=null;
	   //create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bike class obj
		bike1=factory.getBean("rajaPulsor",Bike.class);
		System.out.println(bike1);
		System.out.println(".......................");
		bike2=factory.getBean("raviPulsor",Bike.class);
		System.out.println(bike2);
		
		System.out.println(".......................");
		bike2=factory.getBean("basePulsor",Bike.class);
		System.out.println(bike2);
		
		

	}

}
