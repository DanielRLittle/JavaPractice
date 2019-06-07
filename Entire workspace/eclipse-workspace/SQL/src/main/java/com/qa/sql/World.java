package com.qa.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class World {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Lidl", "root", "password");
		Statement stmt = conn.createStatement();
		
		String sql = "select * from stores";
//		stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("name") + " store is " + rs.getString("size"));
		}
//		stmt.execute(sql);
	}
}
