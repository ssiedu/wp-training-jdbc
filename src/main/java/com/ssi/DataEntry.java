package com.ssi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DataEntry {

	public static void main(String[] args) throws Exception {

		Connection con=Utility.connect();
		String sql="insert into emp values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		for(int i=1; i<=3; i++) {
			System.out.println("ECode : ");
			int eno=sc.nextInt();
			System.out.println("Name  : ");
			String name=sc.next();
			System.out.println("Sal   : ");
			int sal=sc.nextInt();
			
			ps.setInt(1, eno);
			ps.setString(2, name);
			ps.setInt(3, sal);
			
			int n=ps.executeUpdate();
			System.out.println(n+ " row added");
			
		}
		
		con.close();

	}

}
