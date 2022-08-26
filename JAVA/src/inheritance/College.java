package inheritance;

import java.util.Scanner;

public class College {
    String collegeName;
    Department department;
    Scanner sc = new Scanner(System.in);

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void addDepartment() {
        if (department == null) {
            System.out.println("Choose the Department\n" +
                    "1. ECE\n" +
                    "2. ISE\n" +
                    "3. CSE");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    department = new Ece("Electronics and Communication Engineering", "1", 80000);
                    System.out.println("ECE department added");
                    break;
                case 2:
                    department = new Ise("Information Science and Engineering", "2", 60000);
                    System.out.println("ISE department added");
                    break;
                case 3:
                    department = new Cse("Computer science and Engineering", "3", 20000);
                    System.out.println("CSE department added");
                    break;
                default:
                    System.out.println("Select a valid option");
            }
        } else {
            System.out.println("Department already exist");
        }
    }

    public void removeDepartment() {
        if (department instanceof Ece) {
            System.out.println("ECE department removed");
            department = null;
        } else if (department instanceof Ise) {
            System.out.println("ISE department removed");
            department = null;
        } else if (department instanceof Cse) {
            System.out.println("CSE department removed");
            department = null;
        } else {
            System.out.println("There are no departments to remove");
        }
    }


    public void viewDepartmentDetails() {
        if (department instanceof Ece) {
            Ece ece = (Ece) department;
            System.out.println(ece);
        } else if (department instanceof Ise) {
            Ise ise = (Ise) department;
            System.out.println(ise);
        } else if (department instanceof Cse) {
            Cse cse = (Cse) department;
            System.out.println(cse);
        } else {
            System.out.println("There are no departments to View");
        }
    }

    public String toString() {
        return "College Name: " + this.collegeName;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        College college = (College) o;
        return this.collegeName.equals(college.collegeName);
    }
}
