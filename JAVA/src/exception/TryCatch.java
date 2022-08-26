package exception;

public class TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("cannot divide by zero");
        } catch (NullPointerException nullPointerException) {
            System.out.println("null point exception");
        } finally {
            System.out.println("hii");
        }

    }
}
