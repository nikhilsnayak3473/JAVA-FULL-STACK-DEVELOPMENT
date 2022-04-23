package arrays_and_collections;

import java.util.Scanner;

public class ArrayTraversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Displaying the array elements");
        for (int i = 0; i < size; i++) {
            System.out.println("element at index " + i + " is " + a[i]);
        }
    }
}
