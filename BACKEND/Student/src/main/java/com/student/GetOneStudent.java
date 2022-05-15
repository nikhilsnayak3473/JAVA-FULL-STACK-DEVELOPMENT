package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetOneStudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		PreparedStatement st = conn.prepareStatement("select * from student where id=?");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		st.setInt(1, id);
		ResultSet res = st.executeQuery();
		while(res.next()) {
			System.out.println("ID: "+res.getInt("id"));
			System.out.println("Name: "+res.getString("name"));
			System.out.println("Phone: "+res.getLong("phone"));
			System.out.println("Percentage: "+res.getInt("percentage"));
			System.out.println("Branch: "+res.getString("branch"));
			System.out.println("-------------------------------------");
		}
		st.close();
		conn.close();
	}

}
