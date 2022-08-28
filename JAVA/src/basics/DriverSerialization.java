package basics;


import java.io.*;
import java.util.ArrayList;

public class DriverSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "C:\\Users\\Nikhil\\JAVA-FULL-STACK-DEVELOPMENT\\JAVA\\src\\basics\\serializationExample.txt";
        //Serialization
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        SerializationExample serializationExample = new SerializationExample();
        SerializationExample serializationExample1 = new SerializationExample();
        ArrayList<SerializationExample> serializationExampleArrayList = new ArrayList<>();
        serializationExampleArrayList.add(serializationExample);
        serializationExampleArrayList.add(serializationExample1);
        obj.writeObject(serializationExampleArrayList);
        obj.close();
        file.close();

        //Deserialization

        FileInputStream in = new FileInputStream(fileName);
        ObjectInputStream obj2 = new ObjectInputStream(in);
        ArrayList<SerializationExample> ser = (ArrayList<SerializationExample>) obj2.readObject();
        in.close();
        obj2.close();

        System.out.println(ser);

    }
}
