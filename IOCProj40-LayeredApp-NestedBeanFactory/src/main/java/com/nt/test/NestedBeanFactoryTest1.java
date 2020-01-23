package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create Parent IOC container
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		//create Child IOC container
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//get Controller class obj
		controller=cFactory.getBean("controller",MainController.class);
		try {
		//invoke method
		listVO=controller.showEmpsByDesgs("CLERK","MANAGER");
		  System.out.println("Emloyees having CLERK,MANAGER desgs are");
			/*for(EmployeeVO vo:listVO) {
			  System.out.println(vo);
			}*/
		  listVO.forEach(vo->{
			  System.out.println(vo);
		  });
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
