package oops.nonprimitivetypecasting;

public class Driver {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Shape shape1 = circle1; // Up Casting

		System.out.println(circle1.radius);
		System.out.println(circle1.area);

		System.out.println(shape1.area);
//		System.out.println(shape1.radius); cannot access child class members

//		Shape shape2 = new Shape();
//		Circle circle2 = (Circle) shape2; // Down Casting throws class cast exception because shape2 was not up casted
		
		Shape shape2 = new Circle(); // up casting
		Circle circle2 = (Circle) shape2; // down casting
//		System.out.println(shape2);
//		System.out.println(circle2);
		System.out.println(circle2.radius);
		System.out.println(circle2.area);
	}
}
