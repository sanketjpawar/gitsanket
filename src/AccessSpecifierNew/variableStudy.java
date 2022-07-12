package AccessSpecifierNew;

import AccessSpecifier.variableOperation;

public class variableStudy extends variableOperation {

	public static void main(String[] args) {
		variableOperation p3 = new variableOperation();
		
		System.out.println(" value of d is :"+p3.d);
		
		variableStudy p4 = new variableStudy();
		System.out.println(" value of c is :"+p4.c);
		System.out.println(" value of d is :"+p4.d);
	}

}
