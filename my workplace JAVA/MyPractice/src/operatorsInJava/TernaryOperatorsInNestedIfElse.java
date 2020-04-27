package operatorsInJava;

public class TernaryOperatorsInNestedIfElse {

	public static void main(String[] args) {
		
		
		
		// for shorthand method , i.e , ternary operators, we will code as follows:

		int a= 12, b = 180 , c = 100;
		int result = 0;
		
		
		result = a>b ? a>c ? a: c : b>c ? b : c;
		System.out.println("largest of the three numbers is "+ result);

	}

}
