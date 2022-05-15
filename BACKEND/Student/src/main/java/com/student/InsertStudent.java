package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int id,percentage,cond=0;
		long phone;
		String name,branch;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
		PreparedStatement st = conn.prepareStatement("insert into student values(?,?,?,?,?)");
		while(true) {
			System.out.println("Enter the ID");
			id = sc.nextInt();
			System.out.println("Enter the Name");
			name = sc.next();
			System.out.println("Enter the Phone number");
			phone = sc.nextLong();
			System.out.println("Enter the percentage");
			percentage = sc.nextInt();
			System.out.println("Enter the branch");
			branch = sc.next();
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setLong(3, phone);
			st.setLong(3, phone);
			st.setInt(4, percentage);
			st.setString(5, branch);
			
			st.execute();
			
			System.out.println("Do you want to insert more students\n1. yes\n0. no");
			cond = sc.nextInt();
			if(cond == 0)
				break;
		}
		st.close();
		conn.close();
	}

}
