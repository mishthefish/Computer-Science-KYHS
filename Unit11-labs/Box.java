//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box
{
   private int size;

	public Box()
	{
		size = 0;
	}

	public Box(int count)
	{
		size = count;
	}

	public void setSize(int count)
	{
		size = count;
	}

	public int getSize()
	{
		return 0;
	}

	public String toString()
	{
		String output="";
		for ( int i =1; i <= size; i++)
		{
			for ( int j = size-1 ; j >=i; j--)
			{
				output = output + "*";
			}
			for( int k =1; k <=i; k++)
			{
				output = output + "#";
			}
			output = output + "\n";
		}
		return output;
	}
}