//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCD
{
	private int one, two;

	public GCD()
	{
		one = 0;
		two = 0;
	}

	public GCD(int numOne, int numTwo)
	{
		one = numOne;
		two = numTwo;
	}

	public void setNums(int numOne, int numTwo)
	{
		one = numOne;
		two = numTwo;
	}

	public boolean getGCD( )
	{
		long gcd=0;
		if ( two % one == 0)
		{
			return true; 
		}
		return false;
		
		
		
	}

	public String toString()
	{
		if ( getGCD())
		{
			return "the gcd of " + one + " and "+ two + " is " + one;
		}
		return "false";
	}
}