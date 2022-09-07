package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingDemo {
	public static void main(String[] args) {
		Demo d = new Demo(15, "hi");
		try {
			FileOutputStream f = new FileOutputStream(
					"C:\\Users\\Nikhil\\JAVA-FULL-STACK-DEVELOPMENT\\JAVA-PHASE2\\src\\serialization\\example.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			d.b = 100;
			o.writeObject(d);
			System.out.println("Object Serialized");
			f.close();
			o.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
