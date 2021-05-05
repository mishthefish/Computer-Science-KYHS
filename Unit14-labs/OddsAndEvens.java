//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0;
		
		
		if (odd)
		{
			for ( int i = 0; i < array.length; i++)
			{
				if (array[i] % 2 == 1)
				{
					count++;
				}
			}
		}
		else{
				for ( int i = 0; i < array.length; i++)
				{
					if (array[i] % 2 == 0)
					{
						count++;
					}
				}
		}
		return count;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		
		int numEvens = countEm(array,false);
		
		int [] newArray = new int[numEvens];
		
		int k = 0;
		
		for ( int i =0; i < array.length; i++)
		{
			if ( array[i] % 2 == 0)
			{
				newArray[k] = array[i];
				k++;
			}
		}
		
		
		return newArray;
	}

	public static int[] getAllOdds(int[] array)
	{
		
		int numOdds = countEm(array,true);
		
		int [] newArray = new int[numOdds];
		
		int k = 0;
		
		for ( int i =0; i < array.length; i++)
		{
			if ( array[i] % 2 == 1)
			{
				newArray[k] = array[i];
				k++;
			}
		}
		
		
		return newArray;		
	}
}