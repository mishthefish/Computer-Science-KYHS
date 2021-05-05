//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{
		int count = 0;
		 
		for ( int i = 0; i < str.length(); i++)
		{
			if ( i < str.length() -1 )
			{
				if((str.charAt(i)) == (str.charAt(i+1)) && (i < str.length()-1))
				{
					count++;
				}
			}
			
		} 
		return count;	
		
	}
	
	
	
}
		