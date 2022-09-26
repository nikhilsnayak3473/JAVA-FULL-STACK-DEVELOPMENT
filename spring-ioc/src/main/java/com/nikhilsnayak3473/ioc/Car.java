package com.nikhilsnayak3473.ioc;

public class Car {
	Engine engine;
	
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}



	void move() {
		engine.start();
		System.out.println("Car is moving");
	}
}
