package Inheritance;

public class MultiLevel {
	public static void main(String[] args) {
		// Calling functions of all 3 modules by using module3
		module3 o1 = new module3();
		module3.sign_in();
		o1.sign_up();
		module3.profile();
		o1.home_page();
		module3.report();
		module3.export();
	}
}
