//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
		size=0;
		letter="";
	}

	public TriangleFour(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		int j;
		for(int i=1; i<=size; i++)
		{
			for(j=1;j<=i-1;j++)
			{
				output = output + " ";
			}
			for ( int k =1; k<=size-i+1; k++)
			{
				output = output + letter;
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}