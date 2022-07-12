package Conditions;

public class NestedIf {

	public static void main(String[] args) {
		// Username and password 
		
		String username = "spawar";
		String password = "Sanket@789";
		
		if(username=="spawar")
		{
			System.out.println("Please enter the password");
		if (password =="Sanket@789")
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Please enter the password again");
		}
		}
		else
		{
			System.out.println("Please enter correct username");
		}
		
	}
}
