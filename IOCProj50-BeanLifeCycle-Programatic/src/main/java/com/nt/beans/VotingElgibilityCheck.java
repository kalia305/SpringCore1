package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingElgibilityCheck implements InitializingBean,DisposableBean {
	 private  String name;
	 private  String addrs;
	 private  int age;
	 private  Date verificationDate;

	 public VotingElgibilityCheck() {
		System.out.println("VotingElgibilityCheck.VotingElgibilityCheck()");
	}
	public void setName(String name) {
		System.out.println("VotingElgibilityCheck.setName()");
		this.name = name;
	}
	public void setAddrs(String addrs) {
		System.out.println("VotingElgibilityCheck.setAddrs()");
		this.addrs = addrs;
	}
	public void setAge(int age) {
		System.out.println("VotingElgibilityCheck.setAge()");
		this.age = age;
	}
	
	public void  afterPropertiesSet() {
		System.out.println("VotingElgibilityCheck.afterPropertiesSet()");
		verificationDate=new Date();
		if(name==null || age<=0 || age>=125)
			throw new IllegalArgumentException("Invalid name,age values");
	}
	
  public void myInit() {
	  System.out.println("VotingElgibilityCheck.myInit()");
  }
	
	public void destroy() {
		System.out.println("VotingElgibilityCheck.destroy()");
		name=null;
		age=0;
		addrs=null;
		verificationDate=null;
	}
	
	public void myDestroy() {
		System.out.println("VotingElgibilityCheck.myDestroy()");
	}
	
	
	public  String  checkUrVotingElgibility() {
		if(age<18)
			return "Mr/Miss/Mrs"+name+" u r not elgible for voting";
		else
			return "Mr/Miss/Mrs"+name+" u r  elgible for voting";
	}
	

}
