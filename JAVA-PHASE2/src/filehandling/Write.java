package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\Users\\Nikhil\\JAVA-FULL-STACK-DEVELOPMENT\\JAVA-PHASE2\\src\\objectclass\\filehandling\\example2.txt",true);
		for(int i = 65 ;i<=91;i++) {
			f.write(i);
		}
		
		
		f.close();
		
	}

}
