//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
	   setStrings("", "");
	   sum = "";
   }

   public AddStrings(String one, String two)
   {
	   first = one;
	   last = two;
	   
   }

   public void setStrings(String one, String two)
   {
	   first = one;
	   last = two;
   }

 	public void add( )
 	{
 		sum = first + " " + last;
 		
	}

 	public String toString()
 	{
 		String output = sum;
 		return output;
 		
	}
 	
 	public void print()
 	{
 		out.println("first :: " + first);
 		out.println("last :: " + last);
 	}
 	
}