package Program5;

public class JumpingLoop 
{

	public static void main(String[] args) 
	{
		
		// Write a code using break and continue statements
		/*
		for (int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		*/

		/*
		for (int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		*/
		
		for (int i=1;i<=10;i++)
		{
			if(i==5 || i==3 || i==10)
			{
				break;
			}
			System.out.println(i);
		}
	}

}
