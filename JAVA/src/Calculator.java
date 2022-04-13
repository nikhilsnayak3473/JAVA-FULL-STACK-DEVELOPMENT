class Calculator {
    public static void main(String[] args) {
        int a = 100, b = 20, res;
        System.out.println("a:" + a + " b:" + b);
        res = add(a, b);
        System.out.println("addition: " + res);
        res = sub(a, b);
        System.out.println("subtraction: " + res);
        res = mul(a, b);
        System.out.println("multiplication: " + res);
        res = div(a, b);
        System.out.println("division: " + res);


    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

    private static int div(int a, int b) {
        return a / b;
    }
}
