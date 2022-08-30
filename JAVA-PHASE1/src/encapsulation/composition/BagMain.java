package encapsulation.composition;

public class BagMain {
    public static void main(String[] args) {
        Bag b1 = new Bag("Black", 1000, new Book("KGF Chapter 3", 1000));
        b1.displayBookDetails();
    }
}
