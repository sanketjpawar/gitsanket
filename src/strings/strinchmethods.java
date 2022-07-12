package strings;

public class strinchmethods {

	public static void main(String[] args) {
		String a = "Sanket";    // a==b a.equals(b)  both are true
		String b = "sanket";
		
		String c = new String("Sanket"); 
		String d = new String("Sanket");
		
		//System.out.println(a==b);
		//System.out.println(c==d);   /// boolean conditions
		
		boolean ans = a.equals(b);
		System.out.println(ans);
		
		boolean ans1 = d.equalsIgnoreCase(c);
		System.out.println(ans1);
		
		System.out.println(a.contains("ak"));
	}

}
