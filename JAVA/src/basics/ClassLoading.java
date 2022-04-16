package basics;

class ClassLoading {
    static int age = 20;
    static String name = "ram";

    static {
        System.out.println("I am static multi line initializer");
    }

    public static void display() {
        System.out.println("Inside display method");
    }

    public static void show() {
        System.out.println("Inside show method");
        display();
    }

    public static void main(String[] args) {
        System.out.println("Main method begins....");
        display();
        show();
        System.out.println("Main method ends...");
    }
}

