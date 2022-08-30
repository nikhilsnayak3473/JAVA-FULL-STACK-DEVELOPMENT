package basics;

public class Pencil {
    String brand;
    double price;
    String color;
    Pencil(){}
    Pencil(String brand){
        this.brand = brand;
    }
    Pencil(String brand, double price){
//        this.brand = brand;
        this(brand);
        this.price = price;
    }
    Pencil(String brand, double price, String color){
//        this.brand = brand;
//        this.price = price;
        this(brand,price);
        this.color = color;
    }
}
