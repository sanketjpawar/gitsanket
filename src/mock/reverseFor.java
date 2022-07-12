package mock;
import java.util.Scanner;
public class reverseFor {
	public static void main(String[] args) {
		Scanner o1 = new Scanner(System.in);
		int N;
		System.out.println("Enter the number :");
		int rev =0;
		int rem;
		
		for(N=o1.nextInt();N>0;N=N/10)
		{
			rem = N%10;
			rev = (rev*10) +rem;
		}
		System.out.println("Reverse number is :"+rev);
	}

}
