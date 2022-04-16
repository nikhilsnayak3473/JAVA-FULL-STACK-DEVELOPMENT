package composition;

public class Student {
    private String name;
    private int id;
    private int age;
    private String phNo;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int id) {
        this(name);
        this.id = id;
    }

    public Student(String name, int id, int age) {
        this(name,id);
        this.age = age;
    }

    public Student(String name, int id, int age, String phNo) {
        this(name,id,age);
        this.phNo = phNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void getStudentDetails(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student id: "+this.id);
        System.out.println("Student age: "+this.age);
        System.out.println("Student Phone Number: "+this.phNo);
    }
}
