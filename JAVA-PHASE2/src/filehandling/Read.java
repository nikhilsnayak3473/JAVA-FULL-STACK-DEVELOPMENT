package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class Read {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\Nikhil\\JAVA-FULL-STACK-DEVELOPMENT\\JAVA-PHASE2\\src\\objectclass\\filehandling\\example.txt");

		for (int i = f.read(); i != -1; i = f.read()) {
			System.out.print((char) i);
		}
		
		f.close();

	}
}
