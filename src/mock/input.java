package mock;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
	    String userName;
	    System.out.println("Enter username: ");
	    userName = myObj.next();      
	    System.out.println("Username is: " + userName);        
	  }
	
	}
