package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add(10);
		a.add("Nikhil");
		a.add(1.1f);
		a.add(10000l);

		a.add("Nikhil");// supports duplicate entries
		System.out.println(a); // maintains insertion order

		ArrayList a1 = new ArrayList();

		a1.add(10);
		a1.add("Nikhil");
		
//		a.removeAll(a1);//remove all the elements from a which are present in a1
		a.retainAll(a1);//retains all the elements from a which are present in a1

		System.out.println(a.get(0));// access list item using index

		ListIterator i = a.listIterator(); // returns object of type ListIterator

		// iterate through the list using hasNext and next method
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("..............................................");
		while (i.hasPrevious()) {
			System.out.println(i.previous());
			
			
		}

	}
}
