package serialization;

import java.io.Serializable;

public class Demo implements Serializable {
	private static final long serialVersionUID = -1964777219367553088L;
	int a;
	String s;
	static int b= 10;
	transient int c =50;

	public Demo() {
	}

	public Demo(int a, String s) {
		this.a = a;
		this.s = s;

	}
}
