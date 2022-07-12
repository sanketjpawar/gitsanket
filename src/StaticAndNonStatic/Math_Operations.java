package StaticAndNonStatic;

public class Math_Operations {

	public static void main(String[] args) {
		
	{
		Math_Operations A = new Math_Operations();
		A.add();
		
		}
	}
	public static void add()
	{
		int a= 100;
		int b = 6;
		int sum = a*b;
		int substraction = b-a;
		int multiplication = a*b;
		float division = a/b; 
		
		System.out.println("Addition of numbers is "+sum);
		System.out.println("Substraction of numbers is "+substraction);
		System.out.println("Multiplication of numbers is " +multiplication);
		System.out.println("Division of numbers is "+division);

	}
}