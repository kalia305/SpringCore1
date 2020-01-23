package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		 Resource res=null;
		 BeanFactory factory=null;
		 Object obj=null,obj1=null;
		 WishMessageGenerator generator=null,generator1=null;
		//Locate and hold Spring bean cfg file
		 res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		 //create BeanFactory IOC container
		 factory=new XmlBeanFactory(res);
		 //get Target Bean class object
		 obj=factory.getBean("wmg");
		 //type casting
		 generator=(WishMessageGenerator)obj;
		 //invoke b.method
		 System.out.println("result:::"+generator.generateMessage("raja")); 
		 
		 System.out.println("..................................");
		 generator1=factory.getBean("wmg",WishMessageGenerator.class);
		 System.out.println("result1:::"+generator1.generateMessage("rani"));
		 

	}

}
