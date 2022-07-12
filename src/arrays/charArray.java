package arrays;

public class charArray {

	public static void main(String[] args) {
		char letters[] = new char[5];
		
		letters[0] = 'Q';
		letters[1] = 'W';
		letters[2] = 'E';
		letters[3] = 'R';
		letters[4] = 'T';
		
		for (int i=0; i<letters.length; i++) {
			System.out.println(letters[i]);
		}
			System.out.println("==============");
	
		for(int j=letters.length-1; j>=0; j--) {
			System.out.println(letters[j]);
			}
		}
	}


