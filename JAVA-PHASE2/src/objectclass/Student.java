package objectclass;

import java.util.Objects;

public class Student {
int id;
String name;
int age;
String email;
public Student(int id, String name, int age, String email) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
}
@Override
public int hashCode() {
	return Objects.hash(age, email, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
}




}
