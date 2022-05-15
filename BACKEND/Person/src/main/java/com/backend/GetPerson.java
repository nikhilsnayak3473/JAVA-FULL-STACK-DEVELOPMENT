package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetPerson {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		Statement st = conn.createStatement();
		ResultSet res = st.executeQuery("select * from person");
		while(res.next()) {
			System.out.println("ID: "+res.getInt("id"));
			System.out.println("First Name: "+res.getString("firstName"));
			System.out.println("Last Name: "+res.getString("lastName"));
			System.out.println("Gender: "+res.getString("gender"));
			System.out.println("Age: "+res.getInt("age"));
			System.out.println("Email: "+res.getString("email"));
			System.out.println("-------------------------------------");

		}
		st.close();
		conn.close();
		
	}

}
