package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistenceConfig {
	
	/*@Bean(name="c3P0Ds")
	public  DataSource   createDs() throws Exception{
		ComboPooledDataSource c3P0Ds=null;
		c3P0Ds=new ComboPooledDataSource();
		c3P0Ds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		c3P0Ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		c3P0Ds.setUser("system");
		c3P0Ds.setPassword("manager");
		return c3P0Ds;
	}*/

}
