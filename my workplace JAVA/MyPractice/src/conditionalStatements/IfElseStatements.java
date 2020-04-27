package conditionalStatements;

public class IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 double number = 45;
		
		if (number <= 10) {
			System.out.println("Number is less than 10");
		} else if ( number>10 && number <= 20 ) {
			System.out.println("number is greater 10 and less than 20");
		} else if (number > 20 && number <=30) {
			System.out.println("number is greater than 20 and less than 30");
		
		} else {
			System.out.println("number is greater than 30");
	}
  }
}