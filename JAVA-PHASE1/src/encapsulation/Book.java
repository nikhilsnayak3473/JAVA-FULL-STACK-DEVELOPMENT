package encapsulation;

public class Book {
    private int id;
    private String title;
    private int price;

    public Book() {
    }

    public Book(int id) {
        this.id = id;
    }

    public Book(int id, String title, int price) {
        this(id);
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
