package oops.relationships.aggregation;

public class Bus {
	int number;
	String name;
	Passenger passenger;
	
	Bus(int number, String name){
		this.name = name;
		this.number = number;
	}
	
	public void addPassenger(Passenger passenger) {
		this.passenger = passenger;
		
	}
}
