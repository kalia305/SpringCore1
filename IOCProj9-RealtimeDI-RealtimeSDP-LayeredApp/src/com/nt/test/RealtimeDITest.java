package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
	     BeanFactory factory=null;
	     MainController controller=null;
	     Scanner sc=null;
	     String cno=null,cname=null,cadd=null,pamt=null,rate=null,time=null;
	     CustomerVO vo=null;
	     String result=null;
		//create IOC Container
	     factory=new  XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	     //get Controller class obj
	     controller=factory.getBean("controller",MainController.class);
	     //read inputs and create VO class obj having those inputs
	     sc=new Scanner(System.in);
	    	 System.out.println("Enter  Customer number");
	    	 cno=sc.next();
	    	 System.out.println("Enter  Customer name");
	    	 cname=sc.next();
	    	 System.out.println("Enter  Customer addrs");
	    	 cadd=sc.next();
	    	 System.out.println("Enter  Customer Principle amount");
	    	 pamt=sc.next();
	    	 System.out.println("Enter  Customer rate of intrest");
	    	 rate=sc.next();
	    	 System.out.println("Enter  Customer time of loan");
	    	 time=sc.next();
	    	 vo=new CustomerVO();
	    	 vo.setCustNo(cno);
	    	 vo.setCustName(cname);
	    	 vo.setCustAddrs(cadd);
	    	 vo.setpAmt(pamt);
	    	 vo.setRate(rate);
	    	 vo.setTime(time);
	    	 
	    	 //invoke method
	    	 try {
	    		result=controller.processCustomer(vo);
	    		System.out.println(result);
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    		 System.out.println("Internal Problem");
	    	 }
	    	 
	}//main
}//class
