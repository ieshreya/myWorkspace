package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		
		
//		for ( int i =1; i<=100; i++) {
//			
//			if( i == 35) {
//				break;
//			}
//			
//			System.out.println(i);
//		} 
       
		try (Scanner sc = new Scanner(System.in)) {
			for(;;) {
				int n = sc.nextInt();
				
				if( n < 0) {
					break;
				}
				
			// write any numbers and the code will stop  working after a negative  is put as an input
			}
		}
	}

}
