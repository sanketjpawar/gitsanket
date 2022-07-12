package stringmethods;

public class study2 {
	static String s1 = "Sanket Pawar";
	public static void main(String[] args) {
		
		
		String s2 = "Sanket";
		String s3 = new String ("SANKET PAWAR");
		String s4 = new String ("Sanket Pawar");
		String s5 = new String ("Sanket Pawar");
		/*
		System.out.println(s4==s5);
		
		System.out.println(s1==s4);    // gives false because memory location is different
		System.out.println(s1.equals(s4));  // given true bcoz characters are same
		System.out.println(s4.equals(s5));
		*/
		
		System.out.println(s1.contains("s"));
		System.out.println(s4.contains(s2));
		
		String s6 = "";
		String s7 = null;
		String s8 = " ";
		
		System.out.println(s6.isEmpty());
		//System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());
		
		System.out.println("\n===============");
		System.out.println(s6.isBlank());
		//System.out.println(s7.isBlank());
		System.out.println(s8.isBlank());
		
		
		
		System.out.println(s1.charAt(0));
		
		
	}
}
