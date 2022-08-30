package basics;

class Laptop {
    String brand;
    String processor;
    int price;

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.brand = "HP";
        l1.processor = "i5";
        l1.price = 57000;

        Laptop l2 = new Laptop();
        l2.brand = "HP";
        l2.processor = "i3";
        l2.price = 39000;

        Laptop l3 = new Laptop();
        l3.brand = "Asus";
        l3.processor = "i5";
        l3.price = 65000;


        System.out.println("basics.Laptop 1 brand: " + l1.brand);
        System.out.println("basics.Laptop 1 processor: " + l1.processor);
        System.out.println("basics.Laptop 1 price: " + l1.price);

        System.out.println("basics.Laptop 2 brand: " + l2.brand);
        System.out.println("basics.Laptop 2 processor: " + l2.processor);
        System.out.println("basics.Laptop 2 price: " + l2.price);

        System.out.println("basics.Laptop 3 brand: " + l3.brand);
        System.out.println("basics.Laptop 3 processor: " + l3.processor);
        System.out.println("basics.Laptop 3 price: " + l3.price);


    }
}
