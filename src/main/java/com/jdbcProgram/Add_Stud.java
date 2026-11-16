package com.jdbcProgram;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Add_Stud {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection c = null;

		try {
			c = DriverManager.getConnection(url, user, pswd);
			Statement s = c.createStatement();
			String sql = "insert into student values('hari','101',21)";
			s.execute(sql);

		} catch (SQLException e) {

			System.out.println("Data is not added");
		}

		c.close();
	}
}
