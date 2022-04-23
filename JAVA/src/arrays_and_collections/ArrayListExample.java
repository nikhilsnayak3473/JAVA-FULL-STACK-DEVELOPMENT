package arrays_and_collections;


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(10);
        a.add("Nikhil");
        a.add(1098.398f);
        a.add('b');
        a.add(null);
        a.add(10);
        System.out.println(a.get(0));
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.remove("Nikhil");
        System.out.println(a);


    }
}
