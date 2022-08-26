package inheritance;

public class Prime extends Cab {
    double price;

    public Prime(String from, String to, double price) {
        super(from, to);
        this.price = price;
    }
}
