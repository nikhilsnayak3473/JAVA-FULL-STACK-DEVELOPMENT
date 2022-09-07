package oops.polymorphism;

public class Driver {
	public static void main(String[] args) {
		A a = new B();
		a.m1(); // run time polymorphism - method overriding
		a.m2(); // compile time polymorphism - method shadowing
		
		
//		method overloading - compile time polymorphism
		C c = new C();
		c.method(10);
		c.method(10.5f);
		c.method(100000000L);
		c.method(10,100);
		
//		variable shadowing - compile time polymorphism
		D d = new E();
		System.out.println(d.num);
		
		E e = new F();
		System.out.println(e.num);
	}
}
