package Constructor;

public class practice2 {
	
	public practice2(int a, int b) // constructor with parameter
	{
		int c = a*b;
		System.out.println("Product of above two values is "+c);
	}
	
	
	public practice2() // without parameter
	{
		System.out.println("This is constructor");
			}

	public static void main(String[] args) {
		practice2 o1 = new practice2();
		practice2 o2 = new practice2(54, 67);
		practice2 o3 = new practice2(3,4);
		practice2 o4 = new practice2(3,4);
		
		
	}
}
