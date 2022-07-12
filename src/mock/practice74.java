package mock;

public class practice74 {
	
	public static void M1()
	{
		System.out.println("This is sample static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		M1();
		practice74 o1= new practice74();
		o1.NonStatic1();

	}

	public void NonStatic1()
	{
		System.out.println("This is non static method for practice");
	}
}
