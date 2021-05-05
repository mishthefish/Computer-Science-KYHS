//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		if( one.compareTo(two) > 0  && one.compareTo(three) > 0   )
		{ 
			return one;
		}
		else if(two.compareTo(one) > 0 && two.compareTo(three) > 0)
		{
			return two;
		}
		else if(three.compareTo(one) > 0 && three.compareTo(two) > 0)
		{
			return three;
		}
		else
		{
			return "invalid";
		}
		
		
		
		
		
	}

	public String toString()
	{
	   return " biggest = " + getBiggest();
	}
}