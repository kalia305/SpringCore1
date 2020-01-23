package com.nt.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCMonitoringListener implements ApplicationListener {
          private long start,end;
          
          public IOCMonitoringListener() {
			System.out.println("IOCMonitoringListener: 0-param constructor");
		}
          
	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		if(ae.toString().indexOf("Refreshed")!=-1) {
			start=System.currentTimeMillis();
		}
		else if(ae.toString().indexOf("Closed")!=-1) {
			end=System.currentTimeMillis();
			System.out.println("Applicationcontext Container is in running for "+(end-start)+" ms");
		}

	}

}
