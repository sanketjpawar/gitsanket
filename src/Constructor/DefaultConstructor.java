package Constructor;

public class DefaultConstructor {
	
	int a= 123;
	int b= 321;
	
	public DefaultConstructor() // creating constructor with zero parameter. 
	
	{
		int c = a+b;
		System.out.println("Addition is "+c);
	}

	public static void main(String[] args) {
		DefaultConstructor o1 = new DefaultConstructor();
		o1.sample();
		}
	public void sample()  // creating non static method 
	{
		System.out.println("Value of a is " +a);
	}
}

