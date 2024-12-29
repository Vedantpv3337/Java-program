package Program4;

public class IfElseLadder 
{

	public static void main(String[] args) 
	{
		
		// Check number is POSITIVE , NEGATIVE OR ZERO
		/*
		int num = -24;
		if (num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negaitve");
		}
		else
		{
			System.out.println("Number is zero");
		}
        */
		
		
		// Checking which is the largest of 3 numbers given
		
		int a = 1110, b = 309, c =40;
		if(a>b && a>c)
		{
			System.out.println("a is the largest : "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the largest : "+b);
		}
		else
		{
			System.out.println("c is the largest : "+c);
		}
		
		
		// Multiple statements
		/*
		if(1==2)         // IF consist of boolean statement to check the condition and display result
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(2);
		}
		*/
	}

}
