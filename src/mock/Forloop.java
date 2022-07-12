package mock;

public class Forloop {

	public static void main(String[] args) {
		
	int a= 579;
	int b;    // remainder after division
	int c=0;  // final answer
	// 579/10 = 57 remainder 9
	// 57 /10 = 5  reainder  7
	// 5	
	while (a>0) {
		b=a%10;   // 9 -- 7  ---- 5
		c = (c*10)+ b; // 9  --- 97 ---- 975
		a=a/10;  //57  ------ 5 ---- 0
	}
	System.out.println(c);
	}

}
