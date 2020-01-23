package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.PersonalInfo;

public class NullInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		PersonalInfo info=null;
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		info=factory.getBean("pInfo",PersonalInfo.class);
		System.out.println(info);
		
		
		

	}

}
