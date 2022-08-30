package basics;

public class Boxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);//boxing
        System.out.println(b);
        int c = b.intValue();//unboxing
        System.out.println(c);
    }
}
