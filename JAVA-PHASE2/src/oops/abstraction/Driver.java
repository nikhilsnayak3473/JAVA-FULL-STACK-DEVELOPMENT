package oops.abstraction;

public class Driver {
public static void main(String[] args) {
	Parent p = new Child();
	
	p.talk();
	
	D d = D.getDObject();
	D d1 = D.getDObject();
	System.out.println(d);
	System.out.println(d1);
	
	
}
}
