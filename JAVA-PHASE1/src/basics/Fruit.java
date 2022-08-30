package basics;

public class Fruit {
    String name;

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit();
        f1.name = "mango";
        f2.name = "apple";
        f1.printName();
        f2.printName();
    }

    public void printName() {
        System.out.println(name);
    }
}
