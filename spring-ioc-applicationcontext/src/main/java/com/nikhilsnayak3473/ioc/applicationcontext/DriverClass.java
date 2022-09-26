package com.nikhilsnayak3473.ioc.applicationcontext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

		Cat cat = context.getBean("cat", Cat.class);

		cat.sleep();

		Zebra zebra = context.getBean("zebra", Zebra.class);

		System.out.println(zebra.color);
		System.out.println(zebra.id);

		zebra.cat.sleep();

		context.close();

	}
}
