package mock;

public class newtest {

	public static void main(String[] args) {
		newtest o1 = new newtest();
		newtest o2 = new newtest(123, 2325, 3623);
	}
	 public newtest()
	 {
		 System.out.println("This is without parameter constructor");
	 }
	 
	 public newtest(int b, int c, int d)
	 {
		 System.out.println("Addition is "+(b+c+d));
	 }

}
