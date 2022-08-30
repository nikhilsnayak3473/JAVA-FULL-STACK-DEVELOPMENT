package encapsulation;

public class SimCard {
    private final String number;
    private String serviceProvider;
    private String localCallRate;

    public SimCard(String number) {
        this.number = number;
    }

    public SimCard(String number, String serviceProvider) {
        this(number);
        this.serviceProvider = serviceProvider;
    }

    public SimCard(String number, String serviceProvider, String localCallRate) {
        this(number, serviceProvider);
        this.localCallRate = localCallRate;
    }

    public String getNumber() {
        return number;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getLocalCallRate() {
        return localCallRate;
    }

    public void setLocalCallRate(String localCallRate) {
        this.localCallRate = localCallRate;
    }

    public void printSimDetails() {
        System.out.println("Sim Number: " + this.number);
        System.out.println("Service Provider: " + this.serviceProvider);
        System.out.println("Local Call Rate: " + this.localCallRate);
    }
}
