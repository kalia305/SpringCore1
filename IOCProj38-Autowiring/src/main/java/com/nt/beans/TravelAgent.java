package com.nt.beans;

public class TravelAgent {
	private  String name;
	private  TourPlan tp;
	
	
	public TravelAgent() {
		System.out.println("TravelAgent:: 0-param constructor");
	}
	
	public TravelAgent(String name,TourPlan tp) {
		this.name=name;
		this.tp=tp;
		System.out.println("TravelAgent:: 2-param constructor");
	}
	
	
	
	public TravelAgent(TourPlan tp) {
		this.tp=tp;
		System.out.println("TravelAgent::1-param constructor(tp)");
	}
	
	public TravelAgent(String name) {
		this.name=name;
		System.out.println("TravelAgent::1-param constructor(name)");
	}
	
	public void setName(String name) {
		System.out.println("TravelAgent.setName(-)");
		this.name = name;
	}
	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent.setTp(-)");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [name=" + name + ", tp=" + tp + "]";
	}
	
	
	

}
