//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

	public TenToAny()
	{
		base10 = 0;
		newBase = 0;
	}
	
	public TenToAny(int first, int sec)
	{
		base10 = first;
		newBase = sec;
	}

	public void setNum( int a, int b)
	{
		base10 = a;
		newBase = b;
	}
	public String getNewNum()
	{
		String output = Integer.toString(base10, newBase);
		return output;
	}

	public String toString()
	{
		return base10 +" base 10 is " + getNewNum() + " in base " + newBase;
	}
	
}