package aggregation;

import java.util.Scanner;

public class Bank {
    String bankName;
    String bankBranch;
    Account account;
    Scanner sc = new Scanner(System.in);

    public Bank(String bankName, String bankBranch) {
        this.bankName = bankName;
        this.bankBranch = bankBranch;
    }

    public void createAccount() {
        if (account == null) {
            System.out.println("Enter Account Number");
            long accNumber = sc.nextLong();
            System.out.println("Enter Account Holder Name");
            String accHolderName = sc.nextLine();
            accHolderName = sc.nextLine();
            System.out.println("Enter the Opening Balance of the account");
            long accBalance = sc.nextLong();

            account = new Account(accNumber, accHolderName, accBalance);
            System.out.println("Account created successfully");
            this.account.getAccountDetails();
        } else {
            System.out.println("Account already exists");
        }
    }

    public void deleteAccount() {
        if (account != null) {
            System.out.println("Enter 'YES' to confirm");
            String cond = sc.next();
            if (cond.equals("YES")) {
                account = null;
                System.out.println("Account deleted successfully");
            }
        } else {
            System.out.println("Account does not exists");
        }
    }

    public void deposit() {
        if (account != null) {
            long initialBalance = account.getAccBalance();
            System.out.println("Enter the Amount to be deposited");
            long amountToBeDeposited = sc.nextLong();
            long totalAmount = initialBalance + amountToBeDeposited;
            account.setAccBalance(totalAmount);
            System.out.println("Amount Deposited Successfully");
            System.out.println("Amount Deposited: " + amountToBeDeposited);
            System.out.println("Account Balance: " + account.getAccBalance());
        } else {
            System.out.println("Account does not exists");
        }
    }

    public void withdraw() {
        if (account != null) {
            long initialBalance = account.getAccBalance();
            System.out.println("Enter the Amount to be withdrawn");
            long amountToBeWithdrawn = sc.nextLong();
            long totalAmount = initialBalance - amountToBeWithdrawn;
            if (!(totalAmount < 0)) {
                account.setAccBalance(totalAmount);
                System.out.println("Amount Withdrawn Successfully");
                System.out.println("Amount Withdrawn: " + amountToBeWithdrawn);
                System.out.println("Account Balance: " + account.getAccBalance());
            } else {
                System.out.println("You don't have sufficient balance in your account");
            }

        } else {
            System.out.println("Account does not exists");
        }
    }

    public void balanceEnquiry() {
        if (account != null) {
            System.out.println("Account Balance: " + account.getAccBalance());

        } else {
            System.out.println("Account does not exists");
        }
    }

    public void showAccountDetails() {
        if (account != null) {
            System.out.println("-------Account Details-----------");
            this.account.getAccountDetails();

        } else {
            System.out.println("Account does not exists");
        }
    }

    public void showBankDetails() {
        System.out.println("---------------Bank Details--------------");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Bank Branch: " + this.bankBranch);
    }
}
