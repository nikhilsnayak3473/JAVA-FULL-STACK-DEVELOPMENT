package encapsulation.aggregation;

import java.util.Scanner;

public class School {
    String name;
    String location;
    Student student;
    Scanner sc = new Scanner(System.in);

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void admitStudent() {
        if (student == null) {
            System.out.println("Enter the Student Id:");
            int id = sc.nextInt();
            System.out.println("Enter the Name:");
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.println("Enter phone number:(Enter 'null' if not applicable)");
            String phNo = sc.next();
            student = new Student(id, name, phNo);
            System.out.println("Student Admitted successfully");
            this.student.getStudentDetails();
        } else {
            System.out.println("Admissions Full!!");
        }

    }

    public void removeStudent() {
        if (student != null) {
            System.out.println("Enter 'YES' to confirm");
            String cond = sc.next();
            if (cond.equals("YES")) {
                student = null;
                System.out.println("Student removed successfully");
            }
        } else {
            System.out.println("No student records found");
        }
    }

    public void updateStudentDetails() {
        if (student != null) {
            System.out.println("Enter the field to be updated\n1. Name\n2. Phone Number");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Name");
                    String name = sc.nextLine();
                    name = sc.nextLine();
                    student.setName(name);
                    System.out.println("Student Name updated successfully");
                    System.out.println("Student name: " + student.getName());
                    break;

                case 2:
                    System.out.println("Enter the Phone Number");
                    String phNo = sc.next();
                    student.setPhNo(phNo);
                    System.out.println("Student Phone Number updated successfully");
                    System.out.println("Student name: " + student.getPhNo());
                    break;

                default:
                    System.out.println("Please try again and select a valid option");
            }
        } else {
            System.out.println("Cannot find student records");
        }
    }

    public void displayStudentDetails() {
        if (student != null) {
            System.out.println("------------Student Details--------------");
            this.student.getStudentDetails();
        } else {
            System.out.println("Student records not found");
        }
    }

    public void displaySchoolDetails() {
        System.out.println("-----------School Details----------------");
        System.out.println("School Name: " + this.name);
        System.out.println("School Location: " + this.location);
    }

}
