//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		

		for ( int i = 1; i <= word.length(); i++)
		{
			String frag = word.substring(0, i);
			for ( int j =0; j < i; j++)
			{
				out.print(frag);
				
			}
			out.println("");
		}
	}
} 