package Constructor;

public class Employee {

		int id_no;      				// global varicable created 
		String Employee_Name;
		String Dept;
		char Gender;
		long Contact_no;
		String Date; 
	
	public void Employee_Info()
	{
		System.out.println("\n");
		System.out.println("Employee ID number :"+id_no);			// global variables used in non static class.
		System.out.println("Name :"+Employee_Name);
		System.out.println("Joinin Date :"+Date);
		System.out.println("Department :"+Dept);
		System.out.println("Gender :"+Gender);
		System.out.println("Phone number :" +Contact_no);
		
	}
}

