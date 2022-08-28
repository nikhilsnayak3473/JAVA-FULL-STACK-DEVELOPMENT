package basics;

public class BookDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book b1 = new Book("book1", 10, 200.5);
        b1.bookName = "book1";
        Book b2 = (Book) b1.clone();
        b1.bookName = "new book1";
        System.out.println(b1);
        System.out.println(b2);


    }
}
