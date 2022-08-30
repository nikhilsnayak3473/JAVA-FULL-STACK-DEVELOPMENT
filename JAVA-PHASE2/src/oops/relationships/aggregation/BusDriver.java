package oops.relationships.aggregation;


public class BusDriver {
	
	public static void main(String[] args) {
		
		Bus bus1 = new Bus(100, "Iravatha");
		
		bus1.addPassenger(new Passenger("nikhil",20,'m'));
		
		System.out.println(bus1.name);
		System.out.println(bus1.number);
		System.out.println(bus1.passenger.name);
		System.out.println(bus1.passenger.age);
		System.out.println(bus1.passenger.gender);
		
	}
}
