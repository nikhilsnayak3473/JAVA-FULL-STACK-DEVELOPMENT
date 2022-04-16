package composition;

public class Book {
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void getBookDetails(){
        System.out.println("Book Title: "+this.title);
        System.out.println("Book Price: "+this.price);
    }
}
