package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
public static void main(String[] args) throws FileNotFoundException {
	FileInputStream f = new FileInputStream("file.txt");
}
}
