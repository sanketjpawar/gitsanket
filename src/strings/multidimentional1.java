package strings;

public class multidimentional1 {

	public static void main(String[] args) {
		// defining multidimensional array without using new keyword.
		
		String names[][] = {{"sanket","pawar"},{"rohit","mulik"}};
		
		for(int i=0; i<names.length ;i++) {
			for (int j=0; j<names.length; j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
