package encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(42, "Kruthik B S", 20);
        System.out.println("id: " + s1.getId());
        System.out.println("name: " + s1.getName());
        System.out.println("age: " + s1.getAge());

        s1.setAge(21);
        s1.setId(50);
        s1.setName("Nikhil S");

        System.out.println("----------After updation-----------");
        System.out.println("id: " + s1.getId());
        System.out.println("name: " + s1.getName());
        System.out.println("age: " + s1.getAge());
    }
}
