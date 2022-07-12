package AccessSpecifierNew;

import AccessSpecifier.AccessSpecifier;

public class sample extends AccessSpecifier {

	public static void main(String[] args) {
		AccessSpecifier o2 = new AccessSpecifier();
		o2.pub();
		sample o3 = new sample();
		o3.protect();
	}

}
