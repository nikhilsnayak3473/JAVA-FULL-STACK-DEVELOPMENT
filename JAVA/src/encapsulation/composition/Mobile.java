package encapsulation.composition;

public class Mobile {
    String model;
    long price;
    Sim sim1;
    Sim sim2;

    public Mobile(String model, long price, Sim sim1, Sim sim2) {
        this.model = model;
        this.price = price;
        this.sim1 = sim1;
        this.sim2 = sim2;
    }

    public void getMobileDetails(){
        System.out.println("Mobile model: "+this.model);
        System.out.println("Mobile price: "+this.price);
        System.out.println("Sim1 Details:");
        this.sim1.getSimDetails();
        System.out.println("Sim2 Details:");
        this.sim2.getSimDetails();
    }
}
