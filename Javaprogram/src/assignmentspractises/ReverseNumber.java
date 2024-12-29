package assignmentspractises;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		// Using while loop to reverse number
		/*
		int num = 459247, rev = 0;
		while(num!=0)
		{
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num/=10;
		}
		System.out.println("The reverse the given number is : " + rev);
		*/
		
		// Using for loop to reverse number
		int num = 23457 , rev =0;
		for (;num!=0;num/=10)
		{
			int remainder = num % 10;
			rev = rev * 10 + remainder;
		}
		
		System.out.println("The reverse of the given number is : " +rev);
		

	}

}
