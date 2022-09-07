package oops.abstraction.interfaces;

public interface A {
	
 int a = 10; // public static final
	
	
	 void m1(); // public abstract non static methods
	 
	 default void m4() {
		 System.out.println("hii");
	 }
	 
	 static void m2() { // public static methods
		 
	 }
	 
	 default void m3() { // default non static method
		 
	 }
	
}
