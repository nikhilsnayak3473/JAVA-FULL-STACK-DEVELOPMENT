package objectclass;

public class Driver {
public static void main(String[] args) {
//	Demo t = new Demo();
//	Demo d = new Demo();
//	Demo1  d1 = new Demo1();
//	
//	System.out.println(t.equals(d));
//	System.out.println(t==d);
//	System.out.println(t.equals(d1));
	
	Student student1 = new Student(10, "pavitra", 21, "pavitra@123.com");
	Student student3 = new Student(10, "pavitra", 21, "pavitra@123.com");
	
	Student student2 = new Student(20, "Nikhil", 21, "nikiki@345.com");
	
	System.out.println(student1);
	System.out.println(student2);
	System.out.println(student1.equals(student2));
	System.out.println(student1==student2);
	
	System.out.println(student1.hashCode());
	System.out.println(student2.hashCode());
	
	System.out.println(student1.hashCode() == student3.hashCode());
	
}
}
