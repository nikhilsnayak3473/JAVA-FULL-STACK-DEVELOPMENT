package encapsulation;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the book1 id");
        int id = sc.nextInt();
        System.out.println("Enter book1 title");
        String title = sc.next();
        System.out.println("Enter book1 price");
        int price = sc.nextInt();

        Book b1 = new Book(id, title, price);
        Book b2 = new Book(id);
        Book b3 = new Book();


        System.out.println("\n--------Book1 Details------------");
        System.out.println("Id: " + b1.getId());
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Price: " + b1.getPrice());


        System.out.println("\n-----------Book2 Details------------");
        System.out.println("Id: " + b2.getId());
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Price: " + b2.getPrice());

        System.out.println("Enter title for book2");
        b2.setTitle(sc.next());
        System.out.println("Enter price for book2");
        b2.setPrice(sc.nextInt());


        System.out.println("\n-----------Book2 Details After updating Title and Price------------");
        System.out.println("Id: " + b2.getId());
        System.out.println("Title: " + b2.getTitle());
        System.out.println("Price: " + b2.getPrice());

        System.out.println("\n--------------Book3 Details---------------");
        System.out.println("Id: " + b3.getId());
        System.out.println("Title: " + b3.getTitle());
        System.out.println("Price: " + b3.getPrice());

    }
}
