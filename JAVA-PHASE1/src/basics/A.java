package basics;

class A {


    static float totalAmount;

    static {
        System.out.println("From static of basics.A");
    }

    int A1 = 100;

    public static void main(String[] args) {
        A a = new A();
        a.printName();
        System.out.println(A.totalAmount);
        int A = 10;
        System.out.println(A);


        System.out.println("main() of basics.A");
    }

    public void printName() {
        System.out.println(totalAmount);
        System.out.println(A1);
    }
}
