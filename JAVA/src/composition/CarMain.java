package composition;

public class CarMain {
    public static void main(String[] args) {
        Car c1 = new Car("Roll Royce","Black",20000000,new Engine(6749,666)); //composite relation of car with engine
        c1.printDetails();
    }
}
