package com.nt.utility;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class IOCContainerUtil {
	private static BeanFactory factory;
	static {
		//create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	}
	
	public  static  BeanFactory  getContainer() {
		if(factory!=null)
		  return factory;
		else
			return null;
	}

}
