package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertPerson {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/backend", "root", "root");
	Statement st = conn.createStatement();
//	st.execute("insert into person values(1,'nikhil','nayak',21,'male','nikhilsnayak3473@gmail.com')");
//	st.execute("insert into person values(2,'kruthik','b s',21,'male','kruthik22bs@gmail.com')");
//	st.execute("insert into person values(3,'pavitra','kambar',21,'female','pavitrakambar7@gmail.com')");
//	st.execute("insert into person values(4,'sumanth','K S',21,'male','sumanthgowda08257@gmail.com')");
	st.execute("insert into person values(5,'fake','person',1000,'thanos','thor@asgard.com')");
	st.close();
	conn.close();
}
}
