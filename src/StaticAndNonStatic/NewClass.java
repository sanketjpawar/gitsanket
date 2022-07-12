package StaticAndNonStatic;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static.M2(); //static method called from other class
		Static.M1(); // static method called from other class
		
		NewClass m= new NewClass();
		m.test(); //creating new object and method 
		
		MethodsStudy m2 = new MethodsStudy();
		m2.new1();  // calling non static method from another class
		
		NonStatic m3 = new NonStatic();
		m3.NS2();
	}
	public void test()
	{
		System.out.println("Sample nonstatic"); //runninf method in same class 
	}
	
}
