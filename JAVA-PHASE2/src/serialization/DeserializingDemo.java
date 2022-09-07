package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializingDemo {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream(
					"C:\\Users\\Nikhil\\JAVA-FULL-STACK-DEVELOPMENT\\JAVA-PHASE2\\src\\serialization\\example.txt");
			ObjectInputStream o = new ObjectInputStream(f);
			Demo d = (Demo) o.readObject();
			System.out.println(d.a);
			System.out.println(d.s);
			System.out.println(d.b);
			System.out.println(d.c);
			System.out.println("Object Deserialized");
			f.close();
			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
