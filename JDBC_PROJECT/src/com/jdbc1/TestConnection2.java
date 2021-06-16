package com.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConnection2 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
		ps.setInt(1, 105);
		ps.setString(2, "Raj");
		ps.setString(3, "Joshi");
		ps.setString(4, "raj@gmail.com");
		ps.setString(5, "9822");
		ps.setString(6, "09 MAY 2021");
		ps.setString(7, "25000");
		
		int res = ps.executeUpdate();
		System.out.println("The record inserted : "+res);
	}
}
