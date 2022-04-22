package encapsulation.aggregation;

import exception.InSufficientBalance;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws InSufficientBalance {
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name");
        String bankName = sc.nextLine();
        System.out.println("Enter Bank Branch");
        String bankBranch = sc.nextLine();

        Bank bank = new Bank(bankName, bankBranch);

        while (true) {
            System.out.println("----------------Welcome to " + bankName + "---------------------");
            System.out.println("Enter your choice\n1. Create Account\n2. Delete Account\n3. Deposit\n4. Withdraw\n5. Balance Enquiry\n6. Show Account Details\n7. Show Bank Details\n8. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;

                case 2:
                    bank.deleteAccount();
                    break;

                case 3:
                    bank.deposit();
                    break;

                case 4:
                    try {
                        bank.withdraw();
                    }catch (InSufficientBalance inSufficientBalance)
                    {
                        System.out.println("Insufficient balance");
                    }

                    break;

                case 5:
                    bank.balanceEnquiry();
                    break;

                case 6:
                    bank.showAccountDetails();
                    break;

                case 7:
                    bank.showBankDetails();
                    break;

                case 8:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
