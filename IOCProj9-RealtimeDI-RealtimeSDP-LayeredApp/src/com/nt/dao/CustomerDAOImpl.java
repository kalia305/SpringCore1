package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements CustomerDAO {
	private static final String  INSERT_CUSTOMER_QUERY="INSERT INTO LAYERED_CUSTOMER VALUES(?,?,?,?,?)";
	private DataSource ds;

	public CustomerDAOImpl(DataSource ds) {
	 System.out.println("CustomerDAOImpl:: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		System.out.println("CustomerDAOImpl.insert(-)");
		Connection con=null;
		PreparedStatement ps=null;
		int  count=0;
		//get jdbc con object from jdbc con pool
		con=ds.getConnection();
		//create Jdbc PreparedStatement obj having SQL Query
		ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		//set values to Query params
		ps.setInt(1,bo.getCustNo());
		ps.setString(2,bo.getCustName());
		ps.setString(3,bo.getCustAddrs());
		ps.setFloat(4,bo.getPamt());
		ps.setFloat(5,bo.getIntrAmt());
		//execute SQL Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

}
