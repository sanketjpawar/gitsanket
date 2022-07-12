package arrays;

public class intArray {

	public static void main(String[] args) {
		
		int numbers[] = new int[5];
		
		numbers[0] = 111;
		numbers[1] = 112;
		numbers[2] = 113;
		numbers[3] = 114;
		numbers[4] = 115;
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
			System.out.println("==============");
			
		for(int j=numbers.length-1; j>=0; j--) {
			System.out.println(numbers[j]);
		}
		System.out.println(numbers[1]+numbers[2]);
		}
	}

