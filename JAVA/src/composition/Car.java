package composition;

public class Car {
    private final String model;
    private final String colour;
    private final long price;
    private final Engine engine; // achieving has a relation by creating a reference to dependent class

    public Car(String model, String colour, long price, Engine engine) { // achieving composite relation using constructor
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public void printDetails(){
        System.out.println("Car model: "+this.model);
        System.out.println("Car colour: "+this.colour);
        System.out.println("Car price: "+this.price);
        System.out.println("Car Engine Details: ");
        this.engine.printDetails();
    }


}
