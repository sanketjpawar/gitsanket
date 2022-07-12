package mock;

public class ControlStatement {

	
	public static void main(String[] args) {
		String username = "abcd";
		String password = "abc@123";
		if (username == "abcd") {
			 System.out.println("Enter the password");
			 
			 if (password == "abc@123") {
				 System.out.println("Login success");
			 }
			 else {
				 System.out.println("Enter correct password");
			 }
		}
			 else {
				 System.out.println("Enter correct username");
			 }
		
	}

}
