package assignmentspractises;

public class WeekNo_SwitchCase 
{

	public static void main(String[] args)
	{
	 // Find week no. by taking week name as input using SWITCH CASE
		
		String weekname = "WEDNESDAY";
		switch(weekname)
		{
		case "SUNDAY" : System.out.println("Week no. is 1 :" + "SUNDAY");break;
		case "MONDAY" : System.out.println("Week no. is 2 :" + "MONDAY");break;
		case "TUESDAY" : System.out.println("Week no. is 3 :" + "TUESDAY");break;
		case "WEDNESDAY" : System.out.println("Week no. is 4 :" + "WEDNESDAY");break;
		case "THURSDAY" : System.out.println("Week no. is 5 :" + "THURSDAY");break;
		case "FRIDAY" : System.out.println("Week no. is 6 :" + "FRIDAY");break;
		case "SATURDAY" : System.out.println("Week no. is 7 :" + "SATURDAY");break;
		default : System.out.println("INVALID INPUT");
		}

	}

}
