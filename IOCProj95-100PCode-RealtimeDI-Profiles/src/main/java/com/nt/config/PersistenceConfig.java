package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistenceConfig {
	
	@Bean(name="hkDs")
	@Profile("dev")
	public   DataSource  createHKDs() {
		HikariDataSource hkDs=null;
		hkDs=new HikariDataSource();
		hkDs.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hkDs.setJdbcUrl("jdbc:mysql:///ntsp712db");
		hkDs.setUsername("root");
		hkDs.setPassword("root");
		hkDs.setMaximumPoolSize(10);
		hkDs.setMinimumIdle(4);
		return hkDs;
	}
	
	@Bean(name="c3P0Ds")
	@Profile("test")
	public   DataSource  createC3P0Ds()throws Exception {
		ComboPooledDataSource c3P0Ds=null;
		c3P0Ds=new ComboPooledDataSource();
		c3P0Ds.setDriverClass("com.mysql.cj.jdbc.Driver");
		c3P0Ds.setJdbcUrl("jdbc:mysql:///ntsp712db");
		c3P0Ds.setUser("root");
		c3P0Ds.setPassword("root");
		c3P0Ds.setInitialPoolSize(5);
		c3P0Ds.setMaxPoolSize(10);
		return c3P0Ds;
	}
	
	
	@Bean(name="dbcpDs")
	@Profile("prod")
	public   DataSource  createDBCPDs()throws Exception {
		BasicDataSource bds=null;
		bds=new BasicDataSource();
		bds.setDriverClassName("org.postgresql.Driver");
		bds.setUrl("jdbc:postgresql:///ntsp712db");
		bds.setUsername("postgres");
		bds.setPassword("root");
		bds.setMinIdle(100);
		bds.setMaxTotal(1000);
		return bds;
	}
	
	

}
