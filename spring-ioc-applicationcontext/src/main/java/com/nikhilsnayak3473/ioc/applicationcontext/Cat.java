package com.nikhilsnayak3473.ioc.applicationcontext;

import org.springframework.stereotype.Component;

@Component
public class Cat {
	void sleep() {
		System.out.println("cat is sleeping....");
	}
}
