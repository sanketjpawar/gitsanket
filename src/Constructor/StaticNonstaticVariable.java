package Constructor;

public class StaticNonstaticVariable {
	
	int a = 500;         //global non static variable. (cannot use directly in static as well as non static class)
	static int b = 25;   // global static variable (can be used directly in static as well as non static class)

	public static void main(String[] args) {
		
		StaticNonstaticVariable s = new StaticNonstaticVariable(); 
		
		System.out.println(s.a);         // calling non static variable by creating object 
		System.out.println(b); 				// calling static variable directly 
		s.NSMethod();
		SMethod(); 
	}
	
	public void NSMethod()
	{
		System.out.println("Value of b is "+b);       // calling both variables directly in non static method
		System.out.println("Value of a is "+a);
	}
	
	public static void SMethod()
	{
		StaticNonstaticVariable s1= new StaticNonstaticVariable();
		int sum = s1.a+b; 
		System.out.println("Addition is "+sum);
		System.out.println("Product of a and b is "+(s1.a*b));
		System.out.println("Substraction is "+(s1.a-b));
	}

}
