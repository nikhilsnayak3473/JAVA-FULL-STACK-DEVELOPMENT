package encapsulation.composition;

public class Hostel {
    private String name;
    private String location;
    private Student student;

    public Hostel(String name) {
        this.name = name;
    }

    public Hostel(String name, String location) {
        this(name);
        this.location = location;
    }

    public Hostel(String name, String location, Student student) {
        this(name, location);
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void displayHostelDetails() {
        System.out.println("Hostel Name: " + this.name);
        System.out.println("Hostel Location: " + this.location);
    }
}
