package Program5;

public class WhileLoop 
{

	public static void main(String[] args)
	{
		
	 // Print numbers 1 to 10 using WHILE LOOP
		/*
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		*/
		
		// Print numbers 10 to 1 using WHILE LOOP
				/*
				int i = 10;
				while(i>=1)
				{
					System.out.println(i);
					i--;
				}
				*/
		
		
		// Print only even numbers between 1 to 10
		     /*
		     int i = 1;
		     while(i<=10)
		     {
		    	 if(i%2==0)
		    	 {
		    		 System.out.println(i); 
		    	 }
		    	
		    	 i++;
		     }
		     */
		
		// Print only even numbers between 1 to 10
	     /*
	     int i = 1;
	     while(i<=10)
	     {
	    	 if(i%2==0)
	    	 {
	    		 System.out.println(i); 
	    	 }
	    	
	    	 i++;
	     }
	     */
		
		// Print all number from 1 to 10 with written even and odd in front of number
		
		int i = 1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i +" " +  "EVEN");
			}
			else
			{
				System.out.println(i +" " +  "ODD");
			}
			i++;
		}
		
		
		
		

	}

}
