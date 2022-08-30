package basics;

public class MobileDriver {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile();
        System.out.println(mobile1.name);
        System.out.println(mobile1.ram);
        System.out.println(mobile1.price);
        mobile1.facebook();

        Mobile mobile2 = new Mobile("mobile 1",8,27000);
        System.out.println(mobile2.name);
        System.out.println(mobile2.ram);
        System.out.println(mobile2.price);
        mobile2.facebook();

        System.out.println(mobile2);

    }
}
