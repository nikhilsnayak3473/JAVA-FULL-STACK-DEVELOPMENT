package oops.relationships.composition;

public class Car {
	String brand;
	double price;
	// Engine engine = new Engine(); 1st method for early instantiation
	Engine engine;
	
	Car(String brand, double price, Engine engine){
		this.brand = brand;
		this.price=price;
		this.engine = engine;
	}
	
}
