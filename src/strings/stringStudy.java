package strings;

public class stringStudy {

	public static void main(String[] args) {
		String name = "Velocity Institute";
		
		System.out.println(name.length());
		int l = name.length();
		System.out.println("Length of string is "+l);
		
		System.out.println("===================");
		System.out.println(name.toUpperCase());
		String u = name.toUpperCase();
		System.out.println(u);
		
		System.out.println("===================");
		System.out.println(name.toLowerCase());
		
		System.out.println("===================");
		System.out.println(name.contains("stit"));
		
		
		
	}
}
