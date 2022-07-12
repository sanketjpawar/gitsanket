package Basics;

public class Variable {

	public static void main(String[] args) {
											// Variable declaration, Initialization and usage
											// step1 : Variable declaration 
		String StudentName;
		
											// step 2 : variavle initialization (assigning value to variable)
											// = is called as assignment operator
		StudentName = "Sanket Pawar";
											// usage : giving print command 
		System.out.println(StudentName);
		
		int RollNo = 124;
		System.out.println(RollNo);
		
		char Grade = 'B';
		System.out.println(Grade);
		
										// With concatenation operator 
		String Name = "Sanket Pawar";
		int RollNumber = 1360;
		float Percent = 91.23f;
		char grade = 'A';
		System.out.println("My Name is " +Name);
		System.out.println("My Roll number was " + RollNumber);
		System.out.println("I got "+Percent + " percents");
		System.out.println("My grade is "+grade);
	}

}
