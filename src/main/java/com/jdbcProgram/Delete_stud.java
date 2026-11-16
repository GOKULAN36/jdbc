package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_stud {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		String name = sc.next();
		Connection c = DriverManager.getConnection(url, user, pswd);

		PreparedStatement p = c.prepareStatement("DELETE FROM student WHERE stud_name=?");

		p.setString(1, name);
		int num = p.executeUpdate();
		if (num > 0) {
			System.out.println(name + "deleted ");
		}
		else
			System.out.println(name + "Not found");

	}
}
