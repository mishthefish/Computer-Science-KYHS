//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class HexToBinaryRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		
		
		
		for (int i = 0; i < 7; i++)
		{
			out.print("Enter a letter :: ");
			char alpha = keyboard.next().charAt(0);
			HexToBinary test = new HexToBinary(alpha);
			out.print(test);
			
		}
		

	}
}