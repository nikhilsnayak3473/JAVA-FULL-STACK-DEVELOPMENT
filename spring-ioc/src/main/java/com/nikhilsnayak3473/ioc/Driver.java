package com.nikhilsnayak3473.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Driver {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Dog dog = (Dog) factory.getBean("dog");
		dog.bark();
		
		Student student = (Student) factory.getBean("student");
		student.study();
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.email);
		
		Teacher teacher = (Teacher) factory.getBean("teacher");
		
		System.out.println(teacher.id);
		System.out.println(teacher.name);
		System.out.println(teacher.email);
		
		Car car = (Car) factory.getBean("car");
		
		car.move();
	}

}
