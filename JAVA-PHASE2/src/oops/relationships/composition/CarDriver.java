package oops.relationships.composition;

public class CarDriver {
	public static void main(String[] args) {
		Car car1 = new Car("Rolls Royce", 2700000, new Engine(2000, "Rolls Royce"));

		System.out.println(car1.brand);
		System.out.println(car1.price);
		System.out.println(car1.engine.cc);
		System.out.println(car1.engine.brand);

	}
}
