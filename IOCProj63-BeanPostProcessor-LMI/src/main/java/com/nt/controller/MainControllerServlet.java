package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeMgmtService;


@WebServlet(value="/controller",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	 private ApplicationContext ctx;
	@Override
	public void init() throws ServletException {
	   //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
          StudentDTO sdto=null;
          EmployeeDTO  edto=null;
          String s1=null;
          CollegeMgmtService  service=null;
          String result=null;
          RequestDispatcher rd=null;
          //read s1 req param value
          s1=req.getParameter("s1");
          //get Service class object
          service=ctx.getBean("clgService",CollegeMgmtService.class);
          //prepare DTO class objects and invoke service class methods
          if(s1.equalsIgnoreCase("register Student")) {
        	  sdto=new StudentDTO();
        	  sdto.setId(Integer.parseInt(req.getParameter("stno")));
        	  sdto.setName(req.getParameter("stname"));
        	  sdto.setAddrs(req.getParameter("staddrs"));
        	  sdto.setCourse(req.getParameter("stcourse"));
        	  //invoke service method
        	  result=service.registerStudent(sdto);
          }
          else {
        	  edto=new EmployeeDTO();
        	  edto.setId(Integer.parseInt(req.getParameter("empNo")));
        	  edto.setName(req.getParameter("empName"));
        	  edto.setAddrs(req.getParameter("empAddrs"));
        	  edto.setQlfy(req.getParameter("empQlfy"));
        	  //invoke service method
        	  result=service.registerEmployee(edto);
          }
          //keep the result in request scope
          req.setAttribute("resultMsg",result);
          //forward to result.jsp
          rd=req.getRequestDispatcher("/result.jsp");
          rd.forward(req,res);
	
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   doGet(req,res);
	}
	
	
	@Override
	public void destroy() {
	    ((AbstractApplicationContext) ctx).close();
	}
	

}
