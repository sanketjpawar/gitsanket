package mock;

public class Practice1304 {

	public static void main(String[] args) {
		sample o1 = new sample();
		
		System.out.println(o1.p);			//non static variable is called by [objectname.variablename]
		System.out.println(sample.q);      // static variable is called by the [classname.variablename]
		
		
		practice74 o2 = new practice74();
		o2.NonStatic1();
		practice74.M1();
		
		
		if(sample.q==100)
		{
			System.out.println("Value is 90");
		}
	}
	
	
}
