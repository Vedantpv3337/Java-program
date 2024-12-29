package Program3;

public class TernaryOperator {

	public static void main(String[] args) {

		// Ternary Operators ? :
		// Syntax var = exp ? result 1 : result 2 ;
		/*
		 * int a = 200 , b = 100 ; int x = (a>b)?a:b; System.out.println(x);
		 */

		// ex1
		// int x = (1==1)?100:200; //100
		// System.out.println(x);

		// ex2
		// int x = (1==2)?100:200; //200
		// System.out.println(x);

		// ex3
		int person_age = 30;
		String res = (person_age >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(res);

	}

}
