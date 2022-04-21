package abstraction;

public class AtmMachineMain {
    public static void main(String[] args) {
        AtmMachine atm = new AtmMachine();
        atm.withdraw();
        atm.deposit();
        atm.display();
        atm.balanceEnquiry();
        Atm.show();
    }
}
