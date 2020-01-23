package com.nt.beans;

import java.util.Properties;

public class FacultiesInfo {
	private Properties facultySubjects;

	public void setFacultySubjects(Properties facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	@Override
	public String toString() {
		return "FacultiesInfo [facultySubjects=" + facultySubjects + "]";
	}
	
	

}
