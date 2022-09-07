package oops.inheritance;

public class R extends P {
	int r = 35;

	public void m3() {
		System.out.println("m3 method in R");
	}
	
	public static void main(String[] args) {
		R r = new R();
		System.out.println(r.p);
		r.m1();
		System.out.println(r.r);
		r.m3();
	}
}
