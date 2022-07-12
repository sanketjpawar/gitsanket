package polymorphism;

public class overload {

	public static void main(String[] args) {
		// FOR COMPLIE TIME POLYMORPHISM (EARLY BINDING) (STATIC BINDING)
		
		overload s1 = new overload();
		s1.addition(14, 15);
		s1.addition(20, 25, 65);
	}
	public void addition(int a, int b) {
		System.out.println("Addition is "+(a+b));
	}
	public void addition(int a, int b, int c) {
		System.out.println("Addition is "+(a+b+c));
	}

}
