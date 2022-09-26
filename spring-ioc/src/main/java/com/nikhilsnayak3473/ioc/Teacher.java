package com.nikhilsnayak3473.ioc;

public class Teacher {
	int id;
	String name;
	String email;

	void teach() {
		System.out.println("Teaching.......");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
