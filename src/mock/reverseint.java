package mock;

import java.util.Scanner;
public class reverseint {

	public static void main(String[] args) {
		//reverse the integer
		Scanner obj1= new Scanner(System.in);
		int n;
		System.out.println("Enter the number :");
		n = obj1.nextInt();
		
		int rev = 0;
		int rem; 
		
		while(n>0){
	           
	        rem = n%10;       
	        //System.out.println(rem);
	        rev = (rev*10) + rem;
	        n = n/10; 
	      }
		System.out.println("Reverse number is: "+rev);
	}

}
