package abstraction;

public abstract class Atm {
    public abstract void withdraw();
    public abstract void balanceEnquiry();
    public abstract void deposit();
    public void display(){
        System.out.println("Non static method of ATM");
    }

    public static void show(){
        System.out.println("Static method of ATM");
    }

}





