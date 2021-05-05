//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		out.print("Enter a word :: ");
		String bro = keyboard.nextLine();
		
		StringOddOrEven heybro = new StringOddOrEven(bro);
		out.println(heybro.checkerOne());
		
		out.print("Enter a word :: ");
		String bru = keyboard.nextLine();
		heybro.setString(bru);
		out.println(heybro.checkerOne());
	
		
		
		
	}
}