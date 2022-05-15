package basics;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String designation;

    public Employee(int id, String name, int age, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"employee1",30,100000,"employee");
        Employee e2 = new Employee(2,"employee2",35,150000,"senior employee");
        System.out.println(e1);
        System.out.println(e2);
    }
}
