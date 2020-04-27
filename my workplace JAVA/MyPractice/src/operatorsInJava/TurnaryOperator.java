package operatorsInJava;

public class TurnaryOperator {

	public static void main(String[] args) {
// this is a shortcut for if else statements
		//  variable = <condition> ? expressionTrue : expressionFalse;
		// i.e here expressionTrue = our if condition , expressionFalse = our else condition
		// : means else here
	

	
	
	int a = 4;
	int b = 9;
	int maxOfBothNumbers = 0 ;
	
	
	maxOfBothNumbers = a>b ? a : b ; 
	System.out.println("max of both the numbers is "+ maxOfBothNumbers);
			
	}
	
}
