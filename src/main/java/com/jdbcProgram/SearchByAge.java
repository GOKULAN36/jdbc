package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchByAge {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection connection = DriverManager.getConnection(url, user, pswd);

		PreparedStatement p = connection.prepareStatement("select * from student where stud_name=?");

		p.setString(1, "dinesh");
		ResultSet r= p.executeQuery();
		while(r.next()) {
			System.out.println(r.getString("stud_name")+" "+ r.getString("stud_id")+r.getInt("stud_age"));

		}
		p.close();
	}
}
