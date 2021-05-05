//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TwoToTen
{
	private String binary;

	public TwoToTen()
	{
		 binary = "";
	}

	public TwoToTen(String bin)
	{
		 binary = bin;
	}

	public void setTwo(String bin)
	{
		 binary = bin;
	}

	public long getBaseTen( )
	{
		long ten=0;
		
		for(int i = 0; i < binary.length(); i++)
		{
			if(binary.charAt(i) == '1')
			{
				ten += Math.pow(2,binary.length() - i);
			}
		}
		return ten/2;
	}

	public String toString()
	{
		return binary + " is " + getBaseTen() + " in base 10";
	}
}