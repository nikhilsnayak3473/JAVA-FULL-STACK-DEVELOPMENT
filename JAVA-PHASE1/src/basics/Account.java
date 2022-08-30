package basics;

public class Account {
    private String accountHolder;
    private String accountNumber;
    private String ifscCode;
    private double accountBalance;

    public static Account getAccount() {
        return new Account();
    }

    public static void printData(Account account) {
        System.out.println("--------------account details are------------------------");
        System.out.println(account.getAccountHolder());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getIfscCode());
        System.out.println(account.getAccountBalance());
    }

    public static void main(String[] args) {
        Account acc1 = getAccount();
        acc1.setAccountHolder("nikhil");
        acc1.setAccountNumber("0489119016301");
        acc1.setIfscCode("CNRB000489");
        acc1.setAccountBalance(50000);
        Account acc2 = getAccount();
        acc2.setAccountHolder("pavitra");
        acc2.setAccountNumber("0489119016302");
        acc2.setIfscCode("CNRB000489");
        acc2.setAccountBalance(51000);
        printData(acc1);
        printData(acc2);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
