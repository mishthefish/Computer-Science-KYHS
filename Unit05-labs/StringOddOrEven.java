//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s; 
	}

 	
 	public String checkerOne()
 	{
 		int numberWord = word.length();
 		if ( numberWord % 2 == 0)
 		{
 			return word + " is even.";
 		}
 		else
 		{
 			return word + " is odd.";
 		}
 		
 		
	}
}