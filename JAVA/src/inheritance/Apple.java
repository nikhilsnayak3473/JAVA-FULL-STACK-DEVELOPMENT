package inheritance;

public class Apple extends Fruit {
    int quantity;
    String type;

    public Apple(String colour, double price, int quantity, String breed) {
        super(colour, price);
        this.quantity = quantity;
        this.type = breed;
    }

    public static void main(String[] args) {
        Apple a = new Apple("Red", 200, 4, "Kashmir");

        System.out.println(a.type);
        System.out.println(a.price);
    }
}
