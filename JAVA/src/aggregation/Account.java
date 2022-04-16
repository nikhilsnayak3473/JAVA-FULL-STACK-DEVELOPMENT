package aggregation;

public class Account {
    private final long accNumber;
    private String accHolderName;
    private long accBalance;

    public Account(long accNumber, String accHolderName, long accBalance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public void getAccountDetails() {
        System.out.println("Account Number: " + this.accNumber);
        System.out.println("Account Holder Name: " + this.accHolderName);
        System.out.println("Account Balance: " + this.accBalance);
    }
}
