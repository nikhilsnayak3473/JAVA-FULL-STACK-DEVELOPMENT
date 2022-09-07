package objectclass;

public class Demo {

	int a = 10;
	int b = 20;

	@Override
	public String toString() {
		return "a: " + a + " b: " + b;
	}



	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Demo)) {
			return false;
		}

		Demo d = (Demo) o;
		return d.a == this.a && d.b == this.b;
	}

}
