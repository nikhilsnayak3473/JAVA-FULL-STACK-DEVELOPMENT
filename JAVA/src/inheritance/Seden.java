package inheritance;

public class Seden extends Cab{
    double price;

    public Seden(String from, String to, double price) {
        super(from, to);
        this.price = price;
    }
}
