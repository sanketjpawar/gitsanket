package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args) {
		Vector v1 = new Vector<>();
		
		v1.add('a');
		v1.add(23);
		v1.add("sample");
		v1.add(null);
		v1.add("add");
		
		System.out.println(v1);
												//Enumeration
		Enumeration o1 = v1.elements();
		while(o1.hasMoreElements()) {
			System.out.println(o1.nextElement());
		}
		
		System.out.println("\nBY USING FOR LOOP");
		for(int i =0; i<v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		
		System.out.println("\nBY USING ITERATOR");
		Iterator o2 = v1.iterator();
		while(o2.hasNext()) {
			System.out.println(o2.next());
		}
		
		System.out.println("\nBY USING LIST ITERATOR");
		ListIterator o3 = v1.listIterator();
		while(o3.hasNext()) {
			System.out.println(o3.next());
		}
		
		System.out.println("\nBY USING FOR EACH");
		for(Object o4:v1) {
			System.out.println(o4);
		}
	}
}
