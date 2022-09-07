package collectionframework;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet h = new HashSet(); //Insertion order is not maintained and duplicates not allowed
		h.add(100);
		h.add(5);
		h.add("Nikhil");
		h.add("Nikhil");
		HashSet h1 = new HashSet(); 
		h1.add(100);
		h1.add(82743);
		h.addAll(h1);
		
		
		System.out.println(h);
	}

}
