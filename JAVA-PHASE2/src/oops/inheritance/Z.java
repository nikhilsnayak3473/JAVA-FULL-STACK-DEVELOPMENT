package oops.inheritance;

public class Z extends Y{
	int z = 35;

	public void m3() {
		System.out.println("m3 method in Z");
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		System.out.println(z.x);
		z.m1();
		System.out.println(z.y);
		z.m2();
		System.out.println(z.z);
		z.m3();
	}
}
