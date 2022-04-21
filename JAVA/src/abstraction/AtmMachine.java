package abstraction;

public class AtmMachine extends Atm{
    @Override
    public void deposit() {
        System.out.println("Depositing............");
    }

    @Override
    public void balanceEnquiry() {
        System.out.println("balance enquiry...........");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw ...................");
    }
}
