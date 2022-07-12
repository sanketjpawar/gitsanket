package mock;

public class yogendrasir {
	int a=10;													//global non static variable
	static int b=90;											//global static variable
	
	public static void main(String[] args) 
	{
		yogendrasir gv= new yogendrasir();						// created object
	gv.test();													// calling non-static method
	test1();	
	
	
															// calling static method
	System.out.println("value of a is "+gv.a);				// calling non static global variable -
	
	System.out.println("value of b is "+b);					//calling static global variable from 
	
	
															// call non-static global variable form another class
	sample s= new sample();// created object of another class
	System.out.println("global non-static variable from another class is "+s.p);
																				
	System.out.println("gloabal static variable from another class "+sample.q);
	
	int sub=800-gv.a;								//using nonstatic global variable from same class
	int sub1=900-b;									//using static global variable from same class
	int sub2=1000-s.p;								//using nonstatic global variable from another class
	int sub3=3000-sample.q;							//using static global variable from another class
	
	
	System.out.println("sub is "+sub);
	System.out.println(sub1);
	System.out.println(sub2);
	System.out.println(sub3);
	}
	
	public void test()// non-static method
	{
	int a=890;//local variable 
	int sum=a+10;// we can call non-static global variable
	int sub=b-10;//// we can call static global variable
	}
	public static void test1()// static method
	{
	//int sum=a+10;// we cant call non-static global variable
	int sub=b-10;// we can call static global variable
	}
	}

