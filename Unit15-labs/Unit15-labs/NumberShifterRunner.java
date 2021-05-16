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

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		System.out.println("Lab Chapter 15 - #2  NumberShifter    2021" );
		System.out.println("My name is Mishael Sommers");
		



		int [] array;

		for (int times=0; times<=2; times++)
		{
			// make the array and print it
			array = NumberShifter.makeLucky7Array(10);
			System.out.println("Original Array = "+ Arrays.toString(array));  //see word doc for help here

			// adjust (shift) the array and print it
			array = NumberShifter.shiftEm(array);
			System.out.println("Shifted Array  = " + Arrays.toString(NumberShifter.shiftEm(array)));

			System.out.println();
			System.out.println();
		}
	}
}


