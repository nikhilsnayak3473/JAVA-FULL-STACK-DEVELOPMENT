package com.nikhilsnayak3473.controller;

import com.nikhilsnayak3473.dao.PersonDao;
import com.nikhilsnayak3473.dto.Person;

public class SavePerson {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("Nikhil");
		person.setPhoneNumber(6364470015L);
		person.setAge(20);
		
		PersonDao personDao = new PersonDao();
		
		person = personDao.savePerson(person);
	}

}
