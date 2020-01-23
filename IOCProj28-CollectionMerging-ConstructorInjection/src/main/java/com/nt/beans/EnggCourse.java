package com.nt.beans;

import java.util.List;

public class EnggCourse {
	private List<String> subjects;

	/*public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}*/

	public EnggCourse(List<String> subjects) {
		System.out.println("EnggCourse::1-param constructor");
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}
	
	

}
