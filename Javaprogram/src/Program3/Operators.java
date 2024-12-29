package Program3;

public class Operators 
{

	public static void main(String[] args) 
	{
		
		// Arithmetic Operators  + - * / %
		
		int a=30,b=20;
		int result = a+b;  // output is numeric value hence datatype of 'result' variable is "int"
		System.out.println(result);
		System.out.println("The sum of a and b is :"+(a+b));
		System.out.println("The differnce of a and b is :"+(a-b));
		System.out.println("The multiplication of a and b is :"+(a*b));
		System.out.println("The division of a and b is :"+(a/b));
		System.out.println("The modulo division of a and b is :"+(a%b));
		
		// Relational/Comparator Operators  >  >=  <  <=  ==  !=
		// Always return boolean value (True or False)
		/*
		boolean res = a>b;   // output is boolean value hence datatype of 'res' varaible is "boolean"
		System.out.println(res);
		System.out.println(a>b);      //TRUE
		System.out.println(a>=b);    //TRUE
		System.out.println(a<b);     //FALSE
		System.out.println(a<=b);    //FALSE
		System.out.println(a==b);    //FALSE
		System.out.println(a!=b);    //TRUE
		*/
		// Logical Operators  && || !
		// Always return boolean value (True or False)
		// works between 2 boolean values
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);  //FALSE
		System.out.println(x || y);  //TRUE
		System.out.println(!x);     //FALSE
		System.out.println(!y);     //TRUE 
		
		boolean b1 = 10>20;
		System.out.println(b1);
		
		boolean b2 = 20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2); //FALSE
		System.out.println(b1 || b2); //TRUE
		
		//System.out.println((10>20) && (20>10));
		
		
		

	}

}
