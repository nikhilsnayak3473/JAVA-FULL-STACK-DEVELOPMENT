package maps;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Nikhil");
        map.put("Age", 21);
        map.put("PhNo", 6364470015L);
        System.out.println(map.values());

    }
}
