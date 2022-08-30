package oops.encapsulation;

public class StudentDriver {
public static void main(String[] args) {
	Student student = new Student();
	System.out.println(student.getId());
	System.out.println(student.getEmail());
	System.out.println(student.getName());
	student.setId(50);
	student.setEmail("nikhilsnayak3473@gmail.com");
	student.setName("Nikhil");
	System.out.println(student.getId());
	System.out.println(student.getEmail());
	System.out.println(student.getName());

			
}
}
