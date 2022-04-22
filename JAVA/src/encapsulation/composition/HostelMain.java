package encapsulation.composition;

public class HostelMain {
    public static void main(String[] args) {
        Hostel h1 = new Hostel("Kumaradhara A block","AIET mijar",new Student("Nikhil",50,20,"6364470015"));
        h1.displayHostelDetails();
        h1.getStudent().getStudentDetails();
    }
}
