package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class listStudy {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Sanket");
		al.add("Jitendra");
		al.add("Pawar");
		al.add(123);
		al.add(null);
		al.add('A');
		al.add(15.98);
		al.add(null);
		al.add(123);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf(123));
		System.out.println(al.lastIndexOf(123));
		System.out.println(al.isEmpty());
		
		//to update value
		al.set(6, 80.14);
		System.out.println(al);
		
		al.add(3, "Ahmednagar");
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println("=======================");    
		for (int i=0; i<al.size(); i++)             // print using for loop
		{
			System.out.println(al.get(i));
		}
		System.out.println("=======================");
		Iterator p = al.iterator();                  // print using iterator
		 while (p.hasNext()) {
			 System.out.println(p.next());
		 }
		 System.out.println("=======================");
		 
		for(Object o1:al) {                   // for each
			System.out.println(o1);		 
		 }
	}
	

}
