package com.jdbcdemo.conn;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn1 {

	public static void main(String[] args) {
		try 
		{
			//Step 1 Register the Driver
			Driver d = new com.mysql.cj.jdbc.Driver();
			System.out.println("Driver Registered Successfully...");
			
			//Step 2 Get Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igcdb", "root", "root");
			System.out.println("Connection Created with ID = "+ con);
			
			//Step 3 Create Statement Object
			Statement stmt = con.createStatement();
			System.out.println("Statement Object Created...");
			
			//Step 4 Execute the Query
			//stmt.executeUpdate("insert into course values(4,'Android')");
			stmt.executeUpdate("update course set cname='CPP' where cid=2");
			System.out.println("Query Executed... Data Updated...");
			
			//Step 5 Close Connection
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
