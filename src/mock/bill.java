package mock;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		/* first 100 calls Rs. 200 fix
		 * next 50 - 0.6 each 
		 * next 50 0.5 each
		 * above 200 - 0.4 each
		 */
		
		Scanner object = new Scanner(System.in);  // bill o1 = new bill()
		int calls;
		System.out.println("Enter number of calls :");
		calls = object.nextInt();
		double bill;
		
		if (calls <=100)
		{
			bill = 200;
		}
		else if (calls <=150)   // 200 + (50*0.6) 
		{
			bill = 200 + (calls-100)*0.6;
		}
		else if(calls <=200)   // 165 = 100 (200) + 50 (50*0.6) + 15 *0.5
		{
			bill = 200 + (50 *0.6) + (calls -150)*0.5;
		}
		else
		{
			bill = 200 + (50 *0.6) + (50*0.5)+ (calls -200)*0.4;
		}
		System.out.println("Telephone bill id Rs."+bill);
	}

}
