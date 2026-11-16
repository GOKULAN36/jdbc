package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddMulti_rec {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection connection = DriverManager.getConnection(url, user, pswd);

		PreparedStatement p = connection.prepareStatement("insert into student values(?,?,?)");

		p.setString(1, "dinesh");
		p.setString(2, "105");
		p.setInt(3, 20);

		p.addBatch();

		p.setString(1, "guru");
		p.setString(2, "106");
		p.setInt(3, 20);

		p.addBatch();

		p.setString(1, "adi");
		p.setString(2, "107");
		p.setInt(3, 20);
		p.addBatch();
		p.executeBatch();
	}
}
