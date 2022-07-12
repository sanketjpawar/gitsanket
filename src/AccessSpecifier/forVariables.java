package AccessSpecifier;

public class forVariables {

	public static void main(String[] args) {
		variableOperation p2 = new variableOperation();
		
		// System.out.println(" value of a is :"+p2.a);   Can't call private variable in another class
		System.out.println(" value of b is :"+p2.b);
		System.out.println(" value of c is :"+p2.c);
		System.out.println(" value of d is :"+p2.d);
		
		int add = p2.c + p2.b;
		System.out.println(add);

	}

}
