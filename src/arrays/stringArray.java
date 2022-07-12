package arrays;

public class stringArray {

	public static void main(String[] args) {
		//Defining and using string array 
		
		String names[] = new String[5];
		
		names[0] = "Sanket";
		names[1] = "Dipali";
		names[2] = "Rahul";
		names[3] = "Soni";
		names[4] = "Suraj";
		
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		*/
		for(int i=0; i<names.length; i++) {
			System.out.println("Name is "+names[i]);
		}
							
			System.out.println("=================");
			
		for (int j=names.length-1; j>=0; j--) {
				System.out.println(names[j]);
		}
		}

	}
