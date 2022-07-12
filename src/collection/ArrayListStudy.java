package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		list.add(001);
		list.add("Name");
		list.add(null);
		list.add(12.43);
		list.add('D');
		list.add(true);
		list.add(12.43);
		list.add(null);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list.get(4));
		System.out.println("======================");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======================");
		
		Iterator o1 = list.iterator();
		while(o1.hasNext()) {
			System.out.println(o1.next());     
		}
		System.out.println("======================");
		for(Object o2:list) {
			System.out.println(o2);
		}
		System.out.println("++++++++++++++++++++++");
		ListIterator LI = list.listIterator();
		while(LI.hasNext()) {
			System.out.println(LI.next());
		}
		System.out.println("++++++++++++++++++++++");
		while(LI.hasPrevious()) {
			System.out.println(LI.previous());
		}
	}

}
