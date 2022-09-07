package collectionframework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		
		a.add(10);
		a.add("Nikhil");
		a.add(1.1f);
		a.add(10000l);
		
		a.add("Nikhil");// supports duplicate entries
		System.out.println(a); // maintains insertion order
		
		
		System.out.println(a.get(0));//access list item using index
		
		
		ListIterator i = a.listIterator(); // returns object of type ListIterator
		
		// iterate through the list using hasNext and next method
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("..............................................");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
		
	}
}
