package basics;

import java.util.Scanner;

public class Pavitra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = scanner.nextInt();

//        for (int i = 1; i <= n; i++) {
//            if (i == 1 || i == n) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                for (int j = 1; j <= n; j++)
//                    if (j == 1 || j == n) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//
//            }
//            System.out.println();
//        }

        for (int i=1; i<=n;i++){
            for (int j =1; j<=n;j++){
                if (i==1||j==1||i==n||j==n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
