//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CoolNumbers 
{
	
	public static boolean isCoolNumber( int num )
	{
		 if ( num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1)
		 {
			 return true;
		 }
		return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int total = 0;
		for ( int i = 6 ; i <= stop ; i++ )
		{
			if(isCoolNumber(i)) 
			{
				total++;
			}
			
		}
		return total;
	}
}