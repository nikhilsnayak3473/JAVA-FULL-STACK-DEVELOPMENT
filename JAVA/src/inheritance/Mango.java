package inheritance;

public class Mango extends Fruit{
    int quantity;
    String type;

    public Mango(String colour, double price, int quantity, String type) {
        super(colour, price);
        this.quantity = quantity;
        this.type = type;
    }

    public static void main(String[] args) {
        Mango m = new Mango("orange",200,4,"Alphonso");

        System.out.println(m.type);
        System.out.println(m.price);
    }
}
