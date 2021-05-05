//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	int [] numArray;
	int number;
	
	public ArrayStats(int []a)
	{
		setArray(a);
	}
	
	public void setArray(int[]a)
	
	{
		numArray = a;
	}
	
	
	public static int getGroupSize(int[] array, int specificNumber)
	{
		
		int groupCount = 0; //counts the number of times a specific number exist in a array
	    for (int i = 0; i <= array.length - 1; i++) { //this for loop will check every number in  array
	        if (array[i] ==specificNumber) {
	            groupCount++;// if the current number of the array is the specificNumber, then the count will do plus one
	        }
	    }
	    return groupCount; //return the count
	}
	
	public static int groupCount(int[] array, int groupSize)
	{
	    int groupCount=0;
	    int currentGroup=array[0]; //initialize the current group to be the first group of the array

	    if(getGroupSize(array, array[currentGroup])>=groupSize)
	    { //check the size of the first group
	        groupCount++;
	    }

	    for (int i = 0; i <= array.length - 1; i++) {
	        if (array[i] !=currentGroup) { //checks if the current number is equal to the current group value
	            if(getGroupSize(array, array[i])>=groupSize)
	            {
	                groupCount++;
	            }
	            currentGroup=array[i]; // restart the currentGroup to be the current valume of the array

	        }
	    } //end of for loop
	    return groupCount;
	}
	
	public String toString()
	{
		//return ""+Arrays.toString(array);
		return "";
	}
	
}