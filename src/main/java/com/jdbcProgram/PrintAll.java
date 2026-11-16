package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintAll {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:postgresql://localhost:5432/office";
		String user="postgres";
		String pswd="3051";
		
		
		Connection c = DriverManager.getConnection(url,user,pswd);
		Statement s=  c.createStatement();
		String sql="SELECT * FROM student";
		ResultSet r=s.executeQuery(sql);
			
		 while(r.next()) {
			 System.out.println(r.getString("stud_name")+"  |"+r.getString("stud_id")+" | "+r.getInt("stud_age"));
		 }
		
		 c.close();	
	}

}
