package mock;

public class mockinterview {

	public static void main(String[] args) {
		
		int a= 0;
		int b= 1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		for (int i=1; i<=8; i++ ) {
			c= a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
