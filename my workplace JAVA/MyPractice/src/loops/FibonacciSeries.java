package loops;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			int n = sc.nextInt();
			
			int a = 0;
			int b = 1;
			
			
			System.out.print(a +" ");
			System.out.print(b + " ");

			for(int i = 0; i<n-2; i++) {
				
				int c = a + b;
			
			System.out.println(c+ " ");
			   a = b;
			   b = c;
			   
			   
			   // enter your desired number in the console box after clicking run!

}
		}
	
	}

}
