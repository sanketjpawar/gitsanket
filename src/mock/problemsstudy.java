package mock;
import java.util.Scanner;
public class problemsstudy {

	public static void main(String[] args) {
		//Write a Java program to solve quadratic equations
		// ax2 + bx +c = 0 
		
		Scanner o = new Scanner(System.in);
		System.out.println("A = ");
		int a = o.nextInt();
		System.out.println("B = ");
		int b = o.nextInt();
		System.out.println("C = ");
		int c = o.nextInt();
		
		double chk = (b*b)-4*a*c;
		
		if(chk>0){
			double root1 = (-b + Math.pow(chk, 0.5))/(2*a);
			double root2 = (-b - Math.pow(chk, 0.5))/(2*a);
			System.out.println("Roots are "+root1 +"and "+root2 );
		}
		else if (chk ==0) {
			double root1= (-b)/(2*a);
			System.out.println("Root is "+root1);
		}
		else {
			System.out.println("Eq has no roots");
		}
	}

}
