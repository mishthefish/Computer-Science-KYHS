//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

   public ReverseNumber()
   {
	   
	   
   }
   
   public ReverseNumber( int bruh)
   {
	   number = bruh;
	   
   }
	
	
	public void setNum( int a)
	{
		number = a;
	}


	public int getReverse()
	{
		String heybro = number + "";
		String output = "";
		
		
		
		for ( int i = heybro.length() -1; i >= 0; i--)
		{
			output += heybro.charAt(i);
		}
		
		
		return Integer.parseInt(output);
		
		
		
	}

	public String toString()
	{
		return number + " reversed is " + getReverse();
	}
	
}