package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.bpp.DOJBeanPostProcessor;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.CollegeMgmtService;


@WebServlet(value="/controller",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	 private DefaultListableBeanFactory factory;
	@Override
	public void init() throws ServletException {
		XmlBeanDefinitionReader reader=null;
	   //create IOC container
		factory=new DefaultListableBeanFactory();
		factory.addBeanPostProcessor(new DOJBeanPostProcessor());
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
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
          service=factory.getBean("clgService",CollegeMgmtService.class);
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
	   factory=null;
	}
	

}
