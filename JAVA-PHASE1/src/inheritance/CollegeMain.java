package inheritance;

import java.util.Scanner;

public class CollegeMain {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        College college1 = new College("Alva's institute of engineering and technology ");
        College college = new College("Alva's institute of engineering and technology ");
        System.out.println(college.equals(college1));
        System.out.println(college);
        while (true) {
            System.out.println("-------------Enter your choice-------------\n" +
                    "1. Add Department\n" +
                    "2. Remove Department\n" +
                    "3. View Department Details\n" +
                    "4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    college.addDepartment();
                    break;
                case 2:
                    college.removeDepartment();
                    break;
                case 3:
                    college.viewDepartmentDetails();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option");
            }
            System.out.println("-------------------------------------");
        }
    }
}
