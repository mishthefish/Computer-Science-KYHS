//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int total = 0;
		for ( int i = start; i < stop; i++ )
		{
			total = total + numArray[i];
		}
		return total;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		
		int count = 0;
		for ( int item : numArray)
		{
			if ( item == val)
			{
				count++;
			}
		}
		return count;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		
		int size = numArray.length-getCount(numArray,val);
		int[] newArray = new int [size];
		int k = 0;
		for ( int i = 0; i < numArray.length; i++)
		{
			if (numArray[i] != val)
			{
				newArray[k] = numArray[i];
				k++;
			}
			
		}
		return newArray; 
	}
}