package Program4;

public class SwitchCaseCondition 
{

	public static void main(String[] args)
	{
		
		// Guessing the week name by giving week number---BY SWITCH CASE CONDITION
		
		int weekno=9;
		
		switch(weekno)
		{
		case 1 : System.out.println("SUNDAY");break;
		case 2 : System.out.println("MONDAY");break;
		case 3 : System.out.println("TUESDAY");break;
		case 4 : System.out.println("WEDNESDAY");break;
		case 5 : System.out.println("THURSDAY");break;
		case 6 : System.out.println("FRIDAY");break;
		case 7 : System.out.println("SATURDAY");break;
		default : System.out.println("INVALID INPUT");
		}
		
		

	}

}
