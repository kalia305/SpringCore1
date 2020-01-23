package com.nt.beans;

import java.util.Date;

public class VotingElgibilityCheck {
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
	
	public void myInit() {
		System.out.println("VotingElgibilityCheck.myInit()");
		verificationDate=new Date();
		if(name==null || age<=0 || age>=125)
			throw new IllegalArgumentException("Invalid name,age values");
	}
	
	public void myDestroy() {
		System.out.println("VotingElgibilityCheck.myDestroy()");
		name=null;
		age=0;
		addrs=null;
		verificationDate=null;
		
	}
	
	
	public  String  checkUrVotingElgibility() {
		if(age<18)
			return "Mr/Miss/Mrs"+name+" u r not elgible for voting";
		else
			return "Mr/Miss/Mrs"+name+" u r  elgible for voting";
	}
	

}
