package loops;

import java.util.Scanner;

public class FindingPower {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = 1;
			
			for (int i = 0; i<b ; i++ ) {
				result *= a;
				
			}
			System.out.println(result);
		}  
	}

}
// write one by one both the no. and power in the console box after running!