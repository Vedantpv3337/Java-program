package Program3;

public class IncrimentalOperator 
{

	public static void main(String[] args)
	{
		
		// ++ is an incremental operator
		
		// CASE 1
		/*
		int a=10;
		System.out.println(a);  //10
		
		a++;       // a = a+1   {only increse by 1}
		System.out.println(a);  //11
		*/
		
		// CASE 2   --- Post Increment
		/*
		int a = 10;
		int res = a++;
		System.out.println(res);  //10
		System.out.println(a);   //11
		*/
		
		// CASE 3   --- Pre Increment
		
		int a = 10;
		int res = ++a;
		System.out.println(res);  //11
		System.out.println(a);   //11

	}

}
