package strings;

public class multipdimensional {

	public static void main(String[] args) {
		// defining multidimensional array by using new keyword.
		
		String sample[][]= new String[3][3];
		
		sample[0][0]= "sanket";
		sample[0][1]= "jitendra";
		sample[0][2]= "pawar";
		
		sample[1][0]= "rohit";
		sample[1][1]= "kisan";
		sample[1][2]= "mulik";
		
		sample[2][0]= "prashant";
		sample[2][1]= "namdev";
		sample[2][2]= "padekar";
		
		for(int i=0; i<sample.length; i++) {
			for (int j=0; j<sample.length; j++) {
				System.out.print(sample[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
