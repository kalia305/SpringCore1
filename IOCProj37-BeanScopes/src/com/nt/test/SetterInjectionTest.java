package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		 Resource res=null;
		 BeanFactory factory=null;
		 Object obj=null,obj1=null;
		 Printer p1=null,p2=null;
		 WishMessageGenerator generator=null;
		//Locate and hold Spring bean cfg file
		 res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		 //create BeanFactory IOC container
		 factory=new XmlBeanFactory(res);
		 //get Target Bean class object
		 obj=factory.getBean("wmg");
		 System.out.println("......");
		 obj1=factory.getBean("wmg");
		 System.out.println(obj.hashCode()+"  "+obj1.hashCode());
		 System.out.println("obj==obj1?"+(obj==obj1));
		 System.out.println("==============================");
		 p1=factory.getBean("pu",Printer.class);
		 p2=factory.getBean("pu",Printer.class);
		 System.out.println(p1.hashCode()+"   "+p2.hashCode());
		

	}

}
