package inheritance;

public class Mini extends Cab{
    double price;

    public Mini(String from, String to, double price) {
        super(from, to);
        this.price = price;
    }
}
