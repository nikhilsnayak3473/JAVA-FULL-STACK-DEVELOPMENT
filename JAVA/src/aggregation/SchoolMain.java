package aggregation;

import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the School Name");
        String schoolName = sc.nextLine();
        System.out.println("Enter the School Location");
        String schoolLocation = sc.nextLine();
        School school = new School(schoolName, schoolLocation);
        while (true) {
            System.out.println("Enter your choice\n1. Admit Student\n2. Remove Student\n3. Update Student Details\n4. Display Student Details\n5. Display School Details\n6. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    school.admitStudent();
                    break;

                case 2:
                    school.removeStudent();
                    break;

                case 3:
                    school.updateStudentDetails();
                    break;

                case 4:
                    school.displayStudentDetails();
                    break;

                case 5:
                    school.displaySchoolDetails();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
