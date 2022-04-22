package encapsulation.composition;

public class Bag {
    String colour;
    int price;
    Book book;

    public Bag(String colour, int price, Book book) {
        this.colour = colour;
        this.price = price;
        this.book = book;
    }

    public void displayBookDetails(){
        System.out.println("Bag Colour: "+this.colour);
        System.out.println("Bag Price: "+this.price);
        System.out.println("----------Book details---------");
        this.book.getBookDetails();
    }
}
