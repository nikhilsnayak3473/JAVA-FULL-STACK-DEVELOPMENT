package com.nikhilsnayak3473.ioc.applicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverXml {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Cat cat = context.getBean("cat", Cat.class);

		cat.sleep();
		
		Zebra zebra = context.getBean("zebra",Zebra.class);
		
		System.out.println(zebra.color);
		System.out.println(zebra.id);
		
		zebra.cat.sleep();

		context.close();

	}

}
