package com.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws SQLException  {
	
		Connection con = ConnectionUtil.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from Employee");
		
		while(rs.next()) {
			System.out.println("Employee Id: "+rs.getInt("Employee_Id"));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			System.out.println();
		}
		
		//int res = stmt.executeUpdate("INSERT INTO Employee VALUES (104,'Nilesh','Deokar','Kiran@gmail.com','8805','09 may 2021','45000');");
		
		//System.out.println(res);
		System.gc();
		
	}
}
