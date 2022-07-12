package Constructor;

import StaticAndNonStatic.NonStatic;
import StaticAndNonStatic.Static;

public class Practice1 {
	
	public Practice1(int e)
	{
		System.out.println("Vaule of e is " +e);
	}
	
	public Practice1(String name, int a, int b, int c)
	{
		System.out.println("Student name is "+name);
		System.out.println("Marks in English "+a); 
		System.out.println("Marks in Maths "+b);
		System.out.println("Marks in Science "+c);
		int d = a+b+c;
		System.out.println("Total is "+d);
	}

	public static void main(String[] args) {
		Practice1 o1 = new Practice1("Sanket", 67, 75, 95);
		Practice1 o2 = new Practice1(13);
		Practice1 o3 = new Practice1(124);
		DefaultConstructor o4 = new DefaultConstructor();
		o3.Method1();
		o4.sample();
		Static.M1();
		Static.M2();
		NonStatic obj= new NonStatic(); 
		obj.NS1(); 
		practice2 o5 = new practice2();
		practice2 o6= new practice2(2, 3);
		
		
	}
	public void Method1()
	{
		int q=98;
		int w = 12;
		int p = q*w;
		System.out.println("Product is "+p);
	}
}


/* STATIC METHOD : same class : just method name [M1()]
 * 				   another class : use classname.methodname [StaticM1()]
 * 
 * NONSTATIC METHOD: Same class : define object classname obj = new classname()
 * 								then call the method obj.methodname() [Nonstatic o5 = new NonSatic
 * 																		o5.NS1()   ]
 * 				   : Another class define object same as per same class.
 * 
 * Constructor : Constructor name should be as same as class name. 
 * 				(We can treat it as non static method)
 * 
 */

	