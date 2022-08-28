package basics;

import java.io.Serializable;

public class SerializationExample implements Serializable {
    transient int a = 10;
    int b = 20;

    @Override
    public String toString() {
        return "SerializationExample{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
