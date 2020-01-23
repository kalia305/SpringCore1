package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

import oracle.net.aso.l;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory pFactory=null,cFactory=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create Parent IOC container
		pFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/business-beans.xml"));
		//create Child IOC container
		cFactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/presentation-beans.xml"),pFactory);
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
