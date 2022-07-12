package StaticAndNonStatic;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice p1 = new practice();
		p1.User_Data(1, "ABC", "abc@gmail.com", 9876543210l);
		p1.User_Data(2, "PQR", "pqr@yahoo.in", 1234567890l);
		p1.User_Data(3, "XYZ", "xyz@aol.com", 9876543211l);

	}
	public void User_Data(int SrNo, String Name, String EmailId, long MobileNo)
	{
		System.out.println("=========================================");
		System.out.println("Sr Number : "+SrNo);
		System.out.println("User's name is "+Name);
		System.out.println("Email address : "+EmailId);
		System.out.println("Phone Number : "+MobileNo);
		System.out.println("=========================================");
	}
	
	public void Student_Result(String FullName, int Math, int Science, int History, int English)
	{
		System.out.println("Student's name : " + FullName);
		System.out.println("Mathematics :"+Math);
		System.out.println("Science" +Science);
		System.out.println("History :" + History);
		System.out.println("English :"+English);
		
		int Total = (Math + Science + History + English);
		System.out.println("Total Marks :"+Total);
		float Percent = (Total*100/400f);
		System.out.println("Percentage :" +Percent +"%");
	}
}
