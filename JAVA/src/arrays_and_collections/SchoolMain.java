package arrays_and_collections;

import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the School Name");
        String schoolName = sc.nextLine();
        System.out.println("Enter the School Location");
        String schoolLocation = sc.nextLine();
        System.out.println("Enter the School Code");
        String schoolCode = sc.next();
        School school = new School(schoolName, schoolCode, schoolLocation);
        while (true) {
            System.out.println("Enter your choice\n" +
                    "1. Admit Student\n" +
                    "2. Remove Student\n" +
                    "3. View Student Details\n" +
                    "4. View all Students Details\n" +
                    "5. Display School Details\n" +
                    "6. Update Student Name\n" +
                    "7. Update Student Phone Number\n" +
                    "8. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    school.addStudent();
                    break;

                case 2:
                    school.removeStudent();
                    break;

                case 3:
                    school.viewStudentDetails();
                    break;
                case 4:
                    school.viewAllStudentDetails();
                    break;

                case 5:
                    System.out.println(school);
                    break;

                case 6:
                    school.updateStudentName();
                    break;

                case 7:
                    school.updateStudentPhoneNumber();
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
