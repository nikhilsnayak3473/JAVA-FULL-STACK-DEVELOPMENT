package inheritance;

import java.util.Scanner;

public class Bag {
    Ball b;
    Scanner sc = new Scanner(System.in);

    public void addBall() {
        if (b==null) {
            System.out.println("Which Game do you want to play\n1. Basket Ball\n2. Tennis");
            int choice = sc.nextInt();
            if (choice == 1) {
                b = new BasketBall(10);
                System.out.println("Basket Ball selected");
            } else if (choice == 2) {
                b = new Tennis(3);
                System.out.println("Tennis selected");
            } else {
                System.out.println("Select a valid option");
            }
        }else{
            System.out.println("Bag is full");
        }
    }

    public void removeBall() {
        if (b instanceof BasketBall) {
            b = null;
            System.out.println("Basket Ball removed");
        } else if (b instanceof Tennis){
            b = null;
            System.out.println("tennis ball removed");
        }
        else {
            System.out.println("Ball does not exist");
        }
    }

    public void isBagEmpty() {
        if (b == null) {
            System.out.println("Bag is empty");
        } else {
            System.out.println("Bag is full");
        }
    }

    public void showGame() {
        if (b instanceof BasketBall) {
            System.out.println("Basket Ball");
            BasketBall bb = (BasketBall) b;
            bb.displayBasketBallRadius();
        } else if (b instanceof Tennis) {
            System.out.println("Tennis");
            Tennis t = (Tennis) b;
            t.displayTennisBallRadius();
        } else {
            System.out.println("Cannot play any game");
        }
    }

}
