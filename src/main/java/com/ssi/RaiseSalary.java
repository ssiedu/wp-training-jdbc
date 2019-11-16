package com.ssi;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RaiseSalary {

	public static void main(String[] args) throws Exception{
		
		
		String sql="update emp set sal=sal+? where eno=?";

		Connection con=Utility.connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(2, 111);
		ps.setInt(1, 50000);
		int n=ps.executeUpdate();
		con.close();
		System.out.println(n+ " rows modified");
	}

}
