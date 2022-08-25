package basics;

import java.util.Scanner;

class EvenNumbers {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the range");
//        int i = sc.nextInt();
//        int N = sc.nextInt();
//        while (i<=N){
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

        long num  = 14596325874692L;
        int count=0;

        while(num!=0){
            if (num%2!=0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}

