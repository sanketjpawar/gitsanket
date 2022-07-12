package mock;

public class practice2 {
	
	int g = 123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//practice74.M1();
		//practice74 o2 = new practice74();
		//o2.NonStatic1();
		
		practice2 o1 = new practice2();
		o1.method1();
		System.out.println(o1.g);
	}
	public void method1() {
		System.out.println(g);
	}

}
