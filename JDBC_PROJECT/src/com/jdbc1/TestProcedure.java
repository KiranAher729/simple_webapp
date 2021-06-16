package com.jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class TestProcedure {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionUtil.getConnection();
		
		CallableStatement csmt = con.prepareCall("{call deleteEmployee(?)}");
		csmt.setInt(1, 103);
		csmt.execute();
	}
}
