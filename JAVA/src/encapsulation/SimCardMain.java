package encapsulation;

import java.util.Scanner;

public class SimCardMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sim Number");
        String number = sc.next();
        System.out.println("Enter service provider");
        String serviceProvider = sc.next();
        System.out.println("Enter local call rates");
        String localCallRate = sc.next();

        SimCard s1 = new SimCard(number, serviceProvider, localCallRate);

        while (true) {
            System.out.println("Enter your choice:\n1. Update service provider\n2. update call rates\n3. View Number\n4. view service provider\n5. view call rates\n6. print sim details\n7. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Service provider");
                    serviceProvider = sc.next();
                    s1.setServiceProvider(serviceProvider);
                    break;
                case 2:
                    System.out.println("Enter the call rates");
                    localCallRate = sc.next();
                    s1.setLocalCallRate(localCallRate);
                    break;
                case 3:
                    System.out.println(s1.getNumber());
                    break;
                case 4:
                    System.out.println(s1.getServiceProvider());
                    break;
                case 5:
                    System.out.println(s1.getLocalCallRate());
                    break;
                case 6:
                    s1.printSimDetails();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid option");
                    break;

            }
            System.out.println("--------------------------------------");
        }
    }


}
