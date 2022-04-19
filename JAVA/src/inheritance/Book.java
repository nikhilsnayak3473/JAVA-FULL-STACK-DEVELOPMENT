package inheritance;

public class Book extends Author{
    String name;
    double price;

    public Book(String name, double price, String authorName, int age, String place) {
        this.name = name;
        this.price = price;
        super.authorName = authorName;
        super.age = age;
        super.place = place;
    }

    public static void main(String[] args) {
        Book b =new Book("KGF",250,"Prashant Neel",30,"Karnataka");
        System.out.println("Name: "+b.name);
        System.out.println("Price: "+b.price);
        System.out.println("Author Name: "+b.authorName);
        System.out.println("Age: "+b.age);
        System.out.println("Place: "+b.place);

    }
}
