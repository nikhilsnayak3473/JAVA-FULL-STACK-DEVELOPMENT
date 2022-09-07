package oops.inheritance;

public class Q extends P {
	int q = 25;

	public void m2() {
		System.out.println("m2 method in Q");
	}
	
	public static void main(String[] args) {
		Q q = new Q();
		System.out.println(q.p);
		q.m1();
		System.out.println(q.q);
		q.m2();
	}
}
