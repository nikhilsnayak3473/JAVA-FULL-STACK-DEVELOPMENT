package oops.encapsulation;

public class User {
	private int id;
	private String name;
	private String email;
	private int password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.equals(null)) {
			this.name = name;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.equals(null) && email.endsWith("@gmail.com")) {
			this.email = email;
		} else {
			System.out.println("Invaild email please enter a vaild email");
			setEmail(UserDriver.scanner.next());

		}
	}

	public void setPassword(int password) {
		if (this.password == 0) {
			if (password > 1000) {
				this.password = password;
			} else {
				System.out.println("Invalid password please enter a password of minimum 4 digits");
				setPassword(UserDriver.scanner.nextInt());
			}
		} else {
			System.out.println("Enter the old password");
			int oldPassword = UserDriver.scanner.nextInt();
			if (this.password == oldPassword) {
				if (password > 1000) {
					this.password = password;
				} else {
					System.out.println("Invalid password please enter a password of minimum 4 digits");
					setPassword(UserDriver.scanner.nextInt());
				}
			} else {
				System.out.println("Incorrect old password");
				System.out.println("Enter new password again");
				setPassword(UserDriver.scanner.nextInt());
			}

		}

	}

	public String getUserDetails() {
		return "Id: " + id + "\nName: " + name + "\nEmail: " + email;
	}

}
