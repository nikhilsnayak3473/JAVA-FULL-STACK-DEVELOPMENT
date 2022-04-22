package encapsulation.composition;

public class MobileMain {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Xiomai",27000,new Sim("6364470015","Airtel"),new Sim("6362855245","Jio"));
        System.out.println("----------Mobile Details----------");
        m1.getMobileDetails();
    }
}
