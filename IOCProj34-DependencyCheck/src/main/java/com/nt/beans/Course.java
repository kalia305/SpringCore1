package com.nt.beans;

public class Course {
	private String name;
	private int duration;
	public void setName(String name) {
		this.name = name;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + "]";
	}
	
	

}
