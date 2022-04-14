public class Constructors {
    int a;
    int b;
    public Constructors(int a, int b) {
        System.out.println("I am creating a object and initializing a and b");
        this.a = a;
        this.b = b;
    }

    public Constructors() {
        System.out.println("I am only creating object");
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors(1,2);
        System.out.println(c1.a+" "+c1.b);

        Constructors c2 = new Constructors();
        System.out.println(c2.a+" "+c2.b);


    }
}
