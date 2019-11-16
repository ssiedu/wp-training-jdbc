package com.ssi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpEntry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert a row into emp table
		
		//step-1 (loading of driver)
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Successfully Loaded");
		
		//step-2 (connection establishment)
		String url="jdbc:mysql://localhost:3306/training";
		Connection con=DriverManager.getConnection(url, "root", "root");
		System.out.println("Connected Successfully");
		
		//step-3 (draft sql command)
		String sql="insert into emp values (111,'aaa',50000)";
		
		//step-4( create the Statement object)
		Statement stmt=con.createStatement();
		
		//step-5 (dispatch sql to DB for execution using Statement or PreparedStatement obj)
		int n=stmt.executeUpdate(sql);
		
		//step-6 (close the connection)
		con.close();
		
		
		System.out.println(n+ " row affected");
		
		
		
		
		
		
		
		

	}

}
