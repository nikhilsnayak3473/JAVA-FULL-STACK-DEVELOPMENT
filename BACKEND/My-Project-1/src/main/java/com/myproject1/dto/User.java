package com.myproject1.dto;

public class User {
	private int id;
	private String name;
	private int age;
	private long phoneNumber;
	private String emailID;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", emailID="
				+ emailID + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
