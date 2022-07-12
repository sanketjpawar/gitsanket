package thisAndSuper;

public class thisAnsSuperStudy {
	int a = 124;
	int b = 254;
	public static void main(String[] args) {
		thisAnsSuperStudy o1= new thisAnsSuperStudy();
		o1.method();
	}
	public void method()
	{
		int a = 11;
		System.out.println("Value of local variable is "+a);
		System.out.println("Value to global variable is "+this.a);
	}
}
