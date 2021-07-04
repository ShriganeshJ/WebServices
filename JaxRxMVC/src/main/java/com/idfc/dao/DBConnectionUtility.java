package com.idfc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DBConnectionUtility {
	
	
	
	public static void main(String[] args) {
		
		
		try {
			Connection con = DBConnectionUtility.getConnection();
			System.out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static Connection  getConnection() throws SQLException
	{
	 System.out.println("In Connection ");
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/abhi");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setMaxActive(100);
		ds.setMaxWait(10000);
		ds.setMaxIdle(10);
		Connection con = ds.getConnection();
		
		return con;
		
		
		
	}

}
