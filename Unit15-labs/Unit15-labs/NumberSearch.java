//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	
	public static int[] sortArray(int[] numArray)
	{
		Arrays.sort(numArray);


		return numArray; 
	}
	
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		
		 for(int i = 0; i < numArray.length; i++)
		    {
		      if(numArray[i] > searchNum)
		      {
		        return numArray[i];
		      }
		    }
		return -1;
	}
}