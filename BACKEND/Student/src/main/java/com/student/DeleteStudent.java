package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteStudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		PreparedStatement st = conn.prepareStatement("delete from student where id=?");
		System.out.println("Enter the id");
		int id = sc.nextInt();
		st.setInt(1, id);
		st.execute();
		st.close();
		conn.close();
	}

}
