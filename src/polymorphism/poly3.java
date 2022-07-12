package polymorphism;

public class poly3 {
	// this is run time polymorphism. Binding done at time if running. Also known as later binding /dynamic binding

	public static void main(String[] args) {
		
		poly2 o1 = new poly2();
		poly1 o2 = new poly1();
		
		o1.method1();
		o2.method1();		 
		

	}

}
