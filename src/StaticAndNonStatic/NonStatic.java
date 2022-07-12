package StaticAndNonStatic;

public class NonStatic {

	public static void main(String[] args) {
		NonStatic obj= new NonStatic();  // Define the object first 
		obj.NS1();  
		obj.NS2();
	}
	public void NS1()
	{
		System.out.println("Non Static methos sample 1");
	}
	public void NS2()
	{
		System.out.println("Non Static Sample 2");
	}

}
