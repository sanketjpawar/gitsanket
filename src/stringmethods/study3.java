package stringmethods;

public class study3 {

	public static void main(String[] args) {
		
		String a1 = "abcdefghijklabcdefgh";
		String a2 = "Pawar";
		String a3 = " Velocity";
		
		System.out.println(a1.startsWith("nk",2));
		System.out.println(a2.endsWith("ar"));
		
		System.out.println(a1.concat(" "+a2).concat(a1).concat(a3));
		System.out.println(a1+" " +a2);
		
		System.out.println("=====================");
		System.out.println(a1.substring(5,9));
		
		System.out.println(a1.indexOf('e',5));
		System.out.println(a1.lastIndexOf('a',11));
		
		System.out.println(a1.replace('c', 'v'));
		System.out.println(a1.replace("bcde", "wxyz"));
		System.out.println(a1.replaceAll("de", "ty"));
		 
		 
		
	}

}
