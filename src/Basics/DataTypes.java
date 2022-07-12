package Basics;

public class DataTypes {

	public static void main(String[] args) {
											// 1. Primitive data types (Also known as keywords)
		
											// Data types for Numeric + Non decimal
		byte sampleNumber = -127;
		// byte ranges from -127 to +127
		System.out.println("The value of above byte is " +sampleNumber);
		
		short number = 9672;
		System.out.println("The value of above short is "+ number);
		
		int integer = 298456;
		System.out.println("The value of integer "+integer);
		
		long mobileno = 7798333394l;
		System.out.println("Phone number is " +mobileno);
		
											// data types for Numeric + Decimal
		float percent = 67.25f;
		System.out.println("Percentage is "+percent);
		
		double decimal = 132.945d; 
		System.out.println("Decimal value is " +decimal);
		
		char grade = 'A'; 
		System.out.println("Grade is "+grade);
		
											// conditional boolean data type
		boolean result = true;
		System.out.println(result);
		
											// Non primitive 
		String Company = "British Petroleum"; 
		System.out.println(Company);
		
		
		String q= "Sanket";
		String w= "Sanket";
		System.out.println(q==w);
		
											/*Class Sample = "what should I write here";
												System.out.println("Sample");
											 				*/
		
	}
}
