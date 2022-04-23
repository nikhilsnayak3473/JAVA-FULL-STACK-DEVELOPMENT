package arrays_and_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    String schoolName;
    String schoolCode;
    String schoolLocation;
    Student student;
    ArrayList<Student> studentList = new ArrayList<>();
    int studentsCount = 1;
    Scanner sc = new Scanner(System.in);

    public School(String schoolName, String schoolCode, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolCode = schoolCode;
        this.schoolLocation = schoolLocation;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolCode='" + schoolCode + '\'' +
                ", schoolLocation='" + schoolLocation + '\'' +
                '}';
    }

    public void addStudent() {
        System.out.println("Enter Student Name");
        String studentName = sc.next();
        System.out.println("Enter Student Age");
        int studentAge = sc.nextInt();
        System.out.println("Enter Student Mobile Number");
        long studentPhoneNumber = sc.nextLong();
        student = new Student(this.schoolCode + this.studentsCount, studentName, studentAge, studentPhoneNumber);
        studentList.add(student);
        System.out.println("Student added Successfully\nStudent Id is: " + this.schoolCode + this.studentsCount);
        studentsCount++;

    }

    public void removeStudent() {
        if (!studentList.isEmpty()) {
            System.out.println("Enter the Student Id");
            String studentId = sc.next();
            for (Student student : studentList
            ) {
                if (student.getStudentId().equals(studentId)) {
                    studentList.remove(student);
                    System.out.println("Student removed");
                    return;
                }
            }
            System.out.println("Student not found");
        } else {
            System.out.println("No students to remove");
        }
    }

    public void viewStudentDetails() {
        if (!studentList.isEmpty()) {
            System.out.println("Enter the Student Id");
            String studentId = sc.next();
            for (Student student : studentList
            ) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student not found");
        } else {
            System.out.println("No students found");
        }
    }

    public void viewAllStudentDetails() {
        if (!studentList.isEmpty()) {
            System.out.println(studentList);
        }else{
            System.out.println("Student list is Empty");
        }
    }

    public void updateStudentName(){
        if (!studentList.isEmpty()) {
            System.out.println("Enter the Student Id");
            String studentId = sc.next();
            for (Student student : studentList
            ) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println("Enter the new name");
                    student.studentName = sc.next();
                    System.out.println("Name updated successfully\nName: "+student.studentName);
                    return;
                }
            }
            System.out.println("Student not found");
        } else {
            System.out.println("No students found");
        }
    }
    public void updateStudentPhoneNumber(){
        if (!studentList.isEmpty()) {
            System.out.println("Enter the Student Id");
            String studentId = sc.next();
            for (Student student : studentList
            ) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println("Enter the new Phone Number");
                    long studentPhoneNumber = sc.nextLong();
                    student.setStudentPhoneNumber(studentPhoneNumber);
                    System.out.println("Phone Number updated successfully\nPhone Number: "+student.getStudentPhoneNumber());
                    return;
                }
            }
            System.out.println("Student not found");
        } else {
            System.out.println("No students found");
        }
    }
}
