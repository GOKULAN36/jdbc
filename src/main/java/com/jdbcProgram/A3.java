package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class A3 {
	public static void main(String[] args) throws SQLException {

		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection c = null;
		System.out.println("enter the details-> name id age");
		try {
			c = DriverManager.getConnection(url, user, pswd);
			PreparedStatement p = c.prepareStatement("insert into student values (?,?,?)");
			p.setString(1, sc.next());
			p.setString(2, sc.next());
			p.setInt(3, sc.nextInt());

			p.execute();
			System.out.println("added successfully");

		} catch (Exception e) {

			System.out.println("Data is not added");
		}

		c.close();
	}
}
