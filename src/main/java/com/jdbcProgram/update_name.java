package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update_name {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection c = null;

		try {
			c = DriverManager.getConnection(url, user, pswd);
			Statement s = c.createStatement();
			String sql = "update student set stud_name='gokulan' where stud_name='gokul'";
			s.execute(sql);
			System.out.println("Updated sucessfully");

		} catch (SQLException e) {

			System.out.println("Data is not added");
		}

		c.close();
	}
}
