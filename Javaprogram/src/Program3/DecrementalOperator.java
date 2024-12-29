package Program3;

public class DecrementalOperator
{

	public static void main(String[] args) 
	{
		
		// -- is an decremental operator
		
				// CASE 1
				/*
				int a=100;
				System.out.println(a);  //100
				
				a--;       // a = a-1   {only decrease by 1}
				System.out.println(a);  //99
				*/
				
				// CASE 2   --- Post Decrement
				/*
				int a = 100;
				int res = a--;
				System.out.println(res);  //100
				System.out.println(a);   //99
				*/
				
				// CASE 3   --- Pre Decrement
				
				int a = 100;
				int res = --a;
				System.out.println(res);  //99
				System.out.println(a);   //99

	}

}
