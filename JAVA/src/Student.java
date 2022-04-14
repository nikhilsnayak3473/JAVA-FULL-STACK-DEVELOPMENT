import java.util.Scanner;
public class Student {
    int id;
    String name;
    int age;
    float percentage;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this(id);
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this(id,name);
        this.age = age;
    }

    public Student(int id, String name, int age, float percentage) {
        this(id,name,age);
        this.percentage = percentage;
    }

    public  void displayDetails()
    {
        System.out.println("----------Student Details------------");
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("percentage: "+this.percentage);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter student1 id");
        int id = sc.nextInt();
        System.out.println("Enter student1 name");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter student1 age");
        int age = sc.nextInt();
        System.out.println("Enter student1 percentage");
        float percentage = sc.nextFloat();
        Student s1 = new Student(id,name,age,percentage);
        s1.displayDetails();
    }
}
