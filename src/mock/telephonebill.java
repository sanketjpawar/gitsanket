package mock;

import java.util.Scanner;

public class telephonebill {
	
	public static void main(String[] args) {
		Scanner O1 = new Scanner(System.in);
		int calls;
		System.out.println("Enter number of calls :");
		calls= O1.nextInt();
		int a = 200;		
		if(calls <= 100)
		{
			System.out.println("Phone bill is Rs. " +a);
		}
		
		else if (calls >100 & calls <=150)
			{
				int b = calls-100;
				double c = a+(b*0.6);
				System.out.println("Telephone bill is Rs."+c);
			}
		else if (calls >150 & calls<=200)
		{
			int c = calls -150;
			double d = 230+(c*0.5);
			System.out.println("Telephone bill is Rs."+d);
		}
		else
		{
			int e = calls - 200;
			double f = 255+(e*0.4);
			System.out.println("Telephone bill is Rs."+f);
		}
		}

	}