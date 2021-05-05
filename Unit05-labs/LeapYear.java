//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	int year;
	public LeapYear()
	{
		year = 0;
	}
	
	public LeapYear(int numYears)
	{
		year = numYears;
		
	}
	
	
	
	
	public void isLeapYear()
	{
		if( year % 4 == 0 || year % 400 ==0)
		{
			out.print(year + " is a leap year.");
			
		}
		else 
		{
			out.print(year + " is NOT a leap year.");
		}
	}
}