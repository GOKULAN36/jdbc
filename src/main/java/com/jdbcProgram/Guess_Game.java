package com.jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Guess_Game {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you  name");
		String name=sc.next();
		int sum=0;
		int r=(int)(Math.random()*9)+1;
		for(int i=0;i<3;i++) {
			if(r==sc.nextInt()) {
				sum+=10;
				r=(int)(Math.random()*9)+1;
			}
		}
		System.out.println(name+"  "+sum);
		String url = "jdbc:postgresql://localhost:5432/office";
		String user = "postgres";
		String pswd = "3051";

		Connection c = DriverManager.getConnection(url, user, pswd);

		PreparedStatement p = c.prepareStatement("INSERT INTO GUESS_GAME VALUES (?,?)");
		p.setString(1, name);
		p.setInt(2, sum);
		p.execute();
		
		c.close();
		
	}
}
