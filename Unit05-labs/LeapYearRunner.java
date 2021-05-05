//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a year :: ");
		int numYears = keyboard.nextInt();
		
		LeapYear bro = new LeapYear(numYears);
		bro.isLeapYear();
		
				
		
		
		
					
	}
}