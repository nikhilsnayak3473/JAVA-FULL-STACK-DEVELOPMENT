package oops.abstraction;

public class D {
	
	private static D d = new D();
	
	private D() {}
	
	public static D getDObject() {
		return d;
	}

}
