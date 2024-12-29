package assignmentspractises;

public class SearchingOfElementsInArray 
{

	public static void main(String[] args) 
	{
		
		int a[] = {100,900,400,200,600};
		int search_element = 200;
		boolean status = false;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element Found");
				
				
				
				
				
				
				
				
				
				 status = true;
				break;
			}
		}
		if(status == false)
		{
			System.out.println("Element Not Found");
			
		}

	}

}
