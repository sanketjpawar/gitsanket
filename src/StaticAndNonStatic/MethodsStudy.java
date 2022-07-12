package StaticAndNonStatic;

public class MethodsStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsStudy object1 = new MethodsStudy();
		MethodsStudy object2 = new MethodsStudy();
		
		object1.new1();
		object2.new2();
	}
	public void new1()
	{
	System.out.println("Calling from same class");	
	}
	public void new2()
	{
		System.out.println("2nd Object from same class");
	}
}

