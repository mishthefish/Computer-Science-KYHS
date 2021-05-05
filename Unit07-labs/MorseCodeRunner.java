//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner; 

public class MorseCodeRunner
{
	public static void main( String args[] )
	{

		Scanner keyboard = new Scanner(in);
		
		
		
		
		for (int i =0; i < 5; i++)
		{
			out.print("Letter: ");
			char alpha = keyboard.next().charAt(0);
			MorseCode test = new MorseCode(alpha);
			out.print(test);
		}
		
	}
}