package mock;

import java.util.Scanner;

public class telephonebill1 {

	// to take number of calls in input 
	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		int Calls;
		System.out.println("Enter the number of calls: ");
		Calls = Obj.nextInt();
		
		// for calculating mobile bill
		
		double bill;
		if(Calls <=100)
		{
			bill = 200;
		}
		else if (Calls <=150)
		{
			bill = 200 + (Calls -100) *0.6;	
		}
		else if (Calls <=200)
		{
			bill = 200 + 50*0.6 + (Calls - 150) *0.5;
		}
		else
		{
			bill = 200 + 50*0.6 + 50*0.5 + (Calls -200) *0.4;
		}
		System.out.println("Total Bill Amount :"+bill);
	}

}
