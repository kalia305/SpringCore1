package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Bike;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class IocProj91BootBeanInheritenceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bike bike=null;
		//get Access to IOC container
		ctx=SpringApplication.run(IocProj91BootBeanInheritenceApplication.class, args);
		//get Bean class object
		bike=ctx.getBean("raviPulsor",Bike.class);
		System.out.println(bike);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
