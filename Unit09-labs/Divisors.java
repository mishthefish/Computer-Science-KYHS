//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		
		String divisors="";
		
		for ( int i = 0; i < number; i++)
		{
			if ( number / ( i + 0.0) % 1 == 0)
			{
				divisors = divisors + i + " ";
			}
		}
		
		
		
		
		
		
		
		
		return number + " has divisors " + divisors;
	}
}