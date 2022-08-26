package encapsulation.composition;

public class Sim {
    String serviceProvider;
    private String simNo;

    public Sim() {
    }

    public Sim(String simNo, String serviceProvider) {
        this.simNo = simNo;
        this.serviceProvider = serviceProvider;
    }

    public String getSimNo() {
        return simNo;
    }

    public void getSimDetails() {
        System.out.println("Sim No: " + this.simNo);
        System.out.println("Service Provider: " + this.serviceProvider);
    }
}
