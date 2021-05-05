//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect()
	{
		
	}
	
	
	public Perfect( int bru)
	{
		number = bru;
		
	}

	public void setNum(int a) 
	{
		number = a;
	}
	public boolean isPerfect()
	{
		
		
		int divisors = 0;
		for ( int i = 0; i < number; i++)
		{
			if ( number / ( i + 0.0) % 1 == 0)
			{
				divisors = divisors + i;
			}
		}
		
		if (divisors == number)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public String toString()
	{
		if (isPerfect())
		{
			return number +" is perfect.";
		}
		else
		{
			return number +" is not perfect.";
		}
	}
	
}