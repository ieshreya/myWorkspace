package loops;

import java.util.Scanner;

public class SeriesSumCode {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in)) {
			
			int n = sc.nextInt();

            float result = 0;	
//		
//	Q1. SERIES SUM		
//		for(float i = 1; i <=n; i++) {
//			
//			result += 1/i;
//			
//			
//		    }
//		
//		System.out.println(result);
		
	
		
		//Q2. add up to n terms in the series 1-1/2+1/3-1/4+1/5........1/n
		
		for( float i = 1; i<=n ; i++) {
			
			if(i % 2 == 0) {
				result -= 1/i;
			
			} else {
	            result += 1/i;		
		}
		}
			
		System.out.println(result);
		
		//now write your desired value for n in console box to get your answer
		
		}
	
		}
	
}

	