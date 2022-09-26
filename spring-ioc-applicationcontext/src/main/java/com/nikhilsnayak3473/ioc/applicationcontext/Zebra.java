package com.nikhilsnayak3473.ioc.applicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Zebra {
	@Value("${id}")
	int id;
	@Value("${color}")
	String color;
	
	Cat cat;

	@Autowired
	public void settingCat(Cat cat) {
		this.cat = cat;
	}
	
}
