package loops;

 import java.util.Scanner;

public class Factorial {
 
	public static void main(String[] args) {
		
		try (var sc = new Scanner (System.in)) {
			int n = sc.nextInt();
			 
			 int factorial = 1;
			  
			 for (int i = n; i>=1 ; i--) {
				 
				 factorial = factorial*i;
				 
			 }
			 System.out.println("factorial of the following number is  " + factorial);
		}
	}

}
