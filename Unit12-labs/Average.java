//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average()
   {
	   setLine("");
	   
   }

   public Average(String s)
   {
	   line = s;
   }

	public void setLine(String s)
	{
		 line = s;
	}

	public int getCount()
	{
		int count=0;		
		return count;
	}


	public int getSum()
	{
		int sum=0;
		Scanner chopper = new Scanner(line);
		while( chopper.hasNextInt())
		{
				sum++;
				chopper.next();
			
			
		}
		
		
	
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		Scanner chopper = new Scanner(line);
		while(chopper.hasNextInt())
		{
			int nextInt = chopper.nextInt();
			
			average = average + nextInt;
		}
		average = average / getSum();

		return average;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return "Average = " + getAverage();
	}
}