package genralization;

public class generalization {

	public static void main(String[] args) {
		sbi o1= new sbi();
		hdfc o2= new hdfc();
		
		o1.loaninterest();
		o1.fd();
		o1.mab();
		System.out.println("+++++++++++++");
		o2.loaninterest();
		o2.fd();
		o2.mab();
		
		String s1 = new String ("abcd");
		String s2 = new String ("abcd");
		
		System.out.println(s1.equals(s2));  // equals checks data prese
		System.out.println(s1==s2);    //== sign checks memory where both variables stored

	}

}
