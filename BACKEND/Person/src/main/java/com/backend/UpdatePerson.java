package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		Statement st = conn.createStatement();
		st.executeUpdate("update person set age=22 where id=3");
		st.close();
		conn.close();
	}

}
