package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentBO extends BaseBO {
	private String course;
	
	public StudentBO() {
     System.out.println("StudentBO:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "StudentBO [course=" + course + ", toString()=" + super.toString() + "]";
	}
	
	

}
