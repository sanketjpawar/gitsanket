package StaticAndNonStatic;

public class Calling_Methods_From_Other_Claases {

	public static void main(String[] args) {
		
		// Calling all the created methods from StaticAndNonstatic package
		
		MethodsStudy C1 = new MethodsStudy();
		C1.new1();
		C1.new2();   									// CALLING FROM METHODSSTUDY CLASS
		
		NewClass C2 = new NewClass();
		C2.test();
		
		NonStatic C3 = new NonStatic();
		C3.NS1();
		C3.NS2();
		
		Static.M1();
		Static.M2();                                 // Calling static methods
		
	}

}
