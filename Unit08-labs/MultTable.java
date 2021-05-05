//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=0;
		stop=0;
	}

	public MultTable(int num, int end)
	{
		number = num;
		stop = end;
	}

	public void setTable(int num, int end)
	{
		number = num;
		stop = end;
	}

	public void printTable( )
	{
		out.println("multiplication table for " + number);
		for ( int i = 1; i <= stop; i++)
		{
			out.println( i + "      " + (i * number) );
			
		}
	}
}