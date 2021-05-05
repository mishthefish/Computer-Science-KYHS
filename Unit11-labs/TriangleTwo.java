//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
		size=0;
		letter="";
	}

	public TriangleTwo( String let, int sz)
	{
		size = sz;
		letter=let;
	}

	public void setTriangle(int count, String let)
	{
		size = count;
		letter=let;
	}
	

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for (int i = size; i>= 1; --i)
		{
			for (int j = 1; j<= i; ++j)
			{
				output = output + letter;
			}
			output = output + "\n";
			
		}
			return output+"\n";
	}
}