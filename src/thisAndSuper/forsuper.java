package thisAndSuper;

public class forsuper extends thisAnsSuperStudy {

	public static void main(String[] args) {
		forsuper o2 = new forsuper();
		o2.method1();
		o2.method();
	}
	
	public void method1()
	{
		int a = 64;
		System.out.println("Global variable from super class is "+super.a);
	}
}
