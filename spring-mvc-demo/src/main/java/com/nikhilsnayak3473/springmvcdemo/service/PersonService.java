package com.nikhilsnayak3473.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nikhilsnayak3473.springmvcdemo.dao.PersonDao;
import com.nikhilsnayak3473.springmvcdemo.dto.Person;

@Component
public class PersonService {
	@Autowired
	PersonDao personDao;
	
	public Person addPerson(Person person) {
		return personDao.addPerson(person);
	}
	
	public List<Person> getAllPersons(){
		return personDao.getAllPersons();
	}
	
	public Person removePerson(int id) {
		return personDao.removePerson(id);
	}
	
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}
	
	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}
}
