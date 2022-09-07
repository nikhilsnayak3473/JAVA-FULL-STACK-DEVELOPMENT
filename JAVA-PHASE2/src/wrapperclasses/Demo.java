package wrapperclasses;

public class Demo {
	public static void main(String[] args) {
		Integer a1 = 25; // Auto Boxing
		System.out.println(a1);
		
		int a2 = a1; //Auto Un Boxing
		
		System.out.println(a2);
		
		Float f = 0.23f;
		Integer d = f.intValue();
	}
}
