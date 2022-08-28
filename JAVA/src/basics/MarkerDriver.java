package basics;

public class MarkerDriver {
    public static void main(String[] args) {
        Marker marker = new Marker(); // process of creating an object is called instantiation
        //syntax: NonPrimitiveDataType referenceVariable = new Constructor();
        marker.brand = "Cello";
        marker.color = "Black";
        marker.price = 50.5;
        Marker.a = 10;
        System.out.println(marker.brand);
        System.out.println(marker.color);
        System.out.println(marker.price);
        System.out.println(Marker.a);
        Marker m = new Marker();
        System.out.println(Marker.a);
        Marker.a = 20;
        System.out.println(Marker.a);
        System.out.println(Marker.a);
    }
}
