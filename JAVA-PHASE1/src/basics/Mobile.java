package basics;

public class Mobile {
    String name;
    int ram;
    double price;

    static {
        System.out.println("This is static multiline initializer of mobile class");
    }

    {
        System.out.println("This is Non static multiline initializer of mobile class");
    }

    Mobile(){}

    Mobile(String name, int ram, double price){
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    void facebook(){
        System.out.println("Facebook opened");
    }


}
