package Conditions;

public class IfElse {

	public static void main(String[] args) {
		
		int MI_Score = 185;
		int CSK_Score = 167;
		
		if (MI_Score > CSK_Score)
		{
			System.out.println("Mumbai Indian won the match");
			System.out.println("Mumbai won by " +(MI_Score-CSK_Score) +" Runs");
		}
		else
		{
			System.out.println("Chennai won the match");
			System.out.println("Chennai won by " +(CSK_Score-MI_Score) +" Runs");
		}

	}

}
