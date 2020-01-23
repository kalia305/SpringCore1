package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.CollegeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class CollegeMgmtServiceImpl implements CollegeMgmtService {
 	private  CollegeDAO dao;
 	
    public CollegeMgmtServiceImpl(CollegeDAO dao) {
		this.dao = dao;
	}
	
    public abstract StudentBO  createStudentBO();
    public abstract EmployeeBO  createEmployeeBO();
	
	
	@Override
	public String registerStudent(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//get StudentBO object
		bo=createStudentBO();
		BeanUtils.copyProperties(dto,bo);
		//use dao
		count=dao.insertStudent(bo);
		if(count==0)
		    return "STudent registration failed";
		else
			return "STudent registration succeded";
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//get EmployeeBO object
		bo=createEmployeeBO();
		//convert  dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dAO
		count=dao.insertEmployee(bo);
		if(count==0)
		    return "Employee registration failed";
		else
			return "Employee registration succeded";
	}

}
