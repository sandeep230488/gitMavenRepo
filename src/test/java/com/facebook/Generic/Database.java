package com.facebook.Generic;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;

public class Database {
	Connection con;
	Statement stmt;

	public Database(String Url, String DriverName, String Username,
			String Password) {
		String url = Url;
		String driverName = DriverName;
		String username = Username;
		String password = Password;
		
		  try { 
			  Class.forName(driverName); 
		  } 
		catch (ClassNotFoundException e) {
			Assert.fail("Error : Loading database coonection driver");
		}
		  
		try {
			con = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Error : Connecting to database");
		}
		//System.out.println("database connected");
	}

	public HashMap<String, List<String>> selectQuery(String Query) {
		HashMap<String, List<String>> parent = new HashMap<String, List<String>>();
		System.out.println(Query);
		String query;
		ResultSet rs;
		ResultSet innerrs;
		try {
			stmt = con.createStatement();
			query = Query;
			rs = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rs.getMetaData();
			int noOfCol = rsmd.getColumnCount();
			for (int i = 0; i < noOfCol; i++) {
				innerrs = stmt.executeQuery(query);
				List<String> sub = new ArrayList<String>();
				while (innerrs.next()) {
					sub.add(innerrs.getString(i+1));
				}
				parent.put(rsmd.getColumnName(i+1), sub);
			}
		} catch (SQLException e) {
			System.out.println("Invalid Query");
			Assert.fail("Invalid Query");
		}
		System.out.println("Hash Map="+parent);
		return parent;
	}

	public int updateQuery(String Query) {
		int rs = 0;
		try {
			System.out.println("Update Query : " + Query);
			stmt = con.createStatement();
			rs = stmt.executeUpdate(Query);
			System.out.println("Updated rows " + rs);
		} catch (SQLException e) {
			System.out.println("Invalid Query");
		}
		return rs;
	}
}
	
	
	
