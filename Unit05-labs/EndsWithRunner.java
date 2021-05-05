//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class EndsWithRunner
{
	public static void main ( String[] args )
	{
		
		StringUtilities bro  = new StringUtilities();
		 bro.endsWith("chicken", "en");
		 bro.endsWith("chicken", "dog");
		 bro.endsWith("alligator", "gator");
		 bro.endsWith("alligator", "all");
		 bro.endsWith("apluscompsci", "sci");
		 bro.endsWith("apluscompsci", "comp");
		
		
		//test cases				
		/*chicken en
			chicken dog
			alligator gator
			alligator all
			apluscompsci sci */
			
		//output
		/*true
			false
			true
			false
			true
			false*/

	}
}