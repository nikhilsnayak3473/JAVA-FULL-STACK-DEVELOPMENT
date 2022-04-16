package aggregation;

public class Student {
    private final int id;
    private String name;
    private String phNo;

    public Student(int id, String name, String phNo) {
        this.id = id;
        this.name = name;
        this.phNo = phNo;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public void getStudentDetails() {
        System.out.println("Student id: " + this.id);
        System.out.println("Student name: " + this.name);
        if (!this.phNo.equals("null")) {
            System.out.println("Student Phone Number: " + this.phNo);
        }
    }
}
