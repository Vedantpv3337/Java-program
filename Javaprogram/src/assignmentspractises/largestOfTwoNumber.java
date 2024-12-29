package assignmentspractises;

public class largestOfTwoNumber
{

	public static void main(String[] args)
	{
		
		// Find largest of two number using if..else condition
		
		int a=20,b=40;
		
		/*
		if(a>b) 
		{
			System.out.println("a is the largest number : "+a);
		}
		else
		{
			System.out.println("b is the largest number : "+b);
		}
		*/
		
		// Find largest of two number using ternary operator
		
		int res = a>b?a:b;
		System.out.println(res);

	}

}
