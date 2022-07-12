package Conditions;

public class ElseIf {

	public static void main(String[] args) {
		 float Percent = 94f;
		 
		 if(Percent >= 66.00f)
		 {
			 System.out.println("Congratulations!!! You got first class with distinction");
		 }
		 else if (60<=Percent & Percent<66)
		 {
			 System.out.println("You got first class");
		 }
		 else if (Percent <60 & Percent >=50)
		 {
			 System.out.println("You got second class");
		 }
		 else if (Percent <50 & Percent > 40)
		 {
			 System.out.println("You got pass class");
		 }
		 else
		 {
			 System.out.println("You are fail");
		 }

	}

}
