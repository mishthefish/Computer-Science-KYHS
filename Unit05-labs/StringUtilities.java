//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class StringUtilities
{
 	
	
	
	
	public StringUtilities()
	{
		
	}
	
	
	
	
	
	public void endsWith(String a, String b)
 	{
		
 		int word = a.indexOf(b);
 		
 		if (word < 0 )
 		{
 			out.println("false");
 		}
 		if(word > 0)
 		{
 			out.println("true");
 		}
 		
 		
	}
}