package exceptionhandling;

public class Test {
	public static void main(String[] args) {
		try {
//			validate(10);
			validate(60);
		} catch (OverAgeException e) {
			e.printStackTrace();
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Execution completed");
	}

	public static void validate(int age) throws OverAgeException, UnderAgeException {
		if (age < 21) {
			throw new UnderAgeException("Age not valid for marriage");
		} else if (age > 40) {
			throw new OverAgeException("Age expired");
		} else {
			System.out.println("You can marray");
		}
	}
}
