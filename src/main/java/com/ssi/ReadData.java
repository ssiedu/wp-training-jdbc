package com.ssi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws Exception {

		Connection con = Utility.connect();
		String sql = "SELECT * FROM EMP WHERE SAL<=70000";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (true) {
			if(!rs.next())break;
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3) * 12);
			System.out.println("___________________________________________");
		}
		con.close();
	}

}
