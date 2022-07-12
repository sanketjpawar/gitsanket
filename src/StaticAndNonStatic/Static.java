package StaticAndNonStatic;

import Basics.Method;

public class Static {
	
	public static void M1() //Defining new static method
	{
		System.out.println("First Sample static methdod");
	}
	public static void M2()
	{
		System.out.println("2nd static Method");
	}

	public static void main(String[] args) {
		M1(); //running static method in same class
		M2();
		Method.SampleStaticMethod();

	}

}
