package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

public class DITest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		/*ctx=new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();*/
		
			//get TargetBean class object
			generator=ctx.getBean("wmg",WishMessageGenerator.class);
			//invoke the method
			System.out.println("Result is::"+generator.generateWishMessage("raja"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
