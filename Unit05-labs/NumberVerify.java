//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	int wholeNumber;
	
	public NumberVerify()
	{
		wholeNumber = 0;
	}
	
	
	public NumberVerify( int num)
	{
		wholeNumber = num;
		
	}
	
	
	public void isOdd()
	{
		if (wholeNumber % 2 != 0)
		{
			out.println(wholeNumber + " is odd :: true");
		}
		else 
		{
			out.println(wholeNumber + " is odd :: false");
		}
		
	}
	public void isEven()
	{
		if (wholeNumber % 2 == 0)
		{
			out.println(wholeNumber + " is even :: true");
		}
		else 
		{
			out.println(wholeNumber + " is even :: false");
		}
		
	}	
}