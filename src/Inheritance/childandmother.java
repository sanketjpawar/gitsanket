package Inheritance;

public class childandmother {

	public static void main(String[] args) {
	childclass o1 = new childclass();
	motherclass.care(); //// static method can be called by using object as well as classname. (Perfer to class with classname)
	o1.smart();
	o1.Happy();    // static method can be called by using object as well as classname. (Perfer to class with classname)
	o1.young();
	
	motherclass o2 = new motherclass();
	// o2.young();   // we cannot call method from childclass in motherclass 
	}

}
