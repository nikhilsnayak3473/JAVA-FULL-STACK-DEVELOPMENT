package basics;

public class Book implements Cloneable {
    String bookName;
    int pages;
    double price;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName, int pages) {
        this(bookName);
        this.pages = pages;
    }

    public Book(String bookName, int pages, double price) {
        this(bookName, pages);
        this.price = price;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
