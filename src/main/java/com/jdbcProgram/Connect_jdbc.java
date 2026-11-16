package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_jdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Class.forName("org.postgresql.Driver");

		Connection connection = DriverManager.getConnection(url, user, pswd);

		System.out.println("DB Connected");
		connection.close();

	}
}
