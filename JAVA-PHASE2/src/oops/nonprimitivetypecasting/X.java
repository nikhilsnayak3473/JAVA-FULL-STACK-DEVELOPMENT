package oops.nonprimitivetypecasting;

public class X {
	int a = 10;

	public static void main(String[] args) {
		X x1 = new X();
		System.out.println(x1);
//		X x2 = x1;
		X x2 = new X();
		x2.a = 20;
		System.out.println(x2);
		System.out.println(x1.a);
		System.out.println(x2.a);
	}
}
