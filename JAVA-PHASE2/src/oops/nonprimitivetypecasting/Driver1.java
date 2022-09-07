package oops.nonprimitivetypecasting;

public class Driver1 {

	public static void main(String[] args) {
//		Cab c = new Auto();
//		Cab c = new Mini();
		Cab c = new Luxury();
		if (c instanceof Auto) {
			Auto a = (Auto) c;
			a.price = 100;
			System.out.println(a.price);

		} else if (c instanceof Mini) {
			Mini m = (Mini) c;
			m.price = 300;
			System.out.println(m.price);
		} else {
			Luxury l = (Luxury) c;
			l.price = 600;
			System.out.println(l.price);
		}
	}

}
