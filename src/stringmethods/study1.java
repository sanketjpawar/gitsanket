package stringmethods;

public class study1 {

	public static void main(String[] args) {
		// 2 methods to define string 
		
		String name= "Velocity Training Institute";
		String stu = new String("Sanket Pawar");
		
		int l =name.length();
		System.out.println("length is "+l);
		System.out.println(stu.length());
		
		
		System.out.println("============");
		System.out.println(name.toUpperCase());
		
		System.out.println("============");
		System.out.println(stu.toLowerCase());
		
		System.out.println("============");
	}

}
