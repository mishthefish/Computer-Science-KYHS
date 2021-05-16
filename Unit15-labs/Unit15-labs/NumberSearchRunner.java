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

public class NumberSearchRunner
{
	public static void main( String args[] ) throws IOException
	{
			int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
			int find = 5;
			out.println("Original Array = "+ Arrays.toString(array));

			array = NumberSearch.sortArray(array);

			out.println("Sorted Array   = "+ Arrays.toString(array));
			out.println();
			out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(array, find) + "\n");

			int[] stilp = {10, 30, 20, 40, 50, 15};
		    find = 12;

		    out.println("Original Array = "+ Arrays.toString(stilp));

				array = NumberSearch.sortArray(stilp);

				out.println("Sorted Array   = "+ Arrays.toString(stilp));
				out.println();
				out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(stilp, find));

		    System.out.println();

		    int[] yoov = {3,4,5,6,8,9,10,11,2,3,4,65};
		    find = 25;

		    out.println("Original Array = "+ Arrays.toString(yoov));

				array = NumberSearch.sortArray(yoov);

				out.println("Sorted Array   = "+ Arrays.toString(yoov));
				out.println();
				out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(yoov, find));

		    System.out.println();

		    int[] stop = {100, 110, 1000, 25000, 65535};
		    find = 32767;

		    out.println("Original Array = "+ Arrays.toString(stop));

				array = NumberSearch.sortArray(stop);

				out.println("Sorted Array   = "+ Arrays.toString(stop));
				out.println();
				out.println("The next largest value after " + find + " is " + NumberSearch.getNextLargest(stop, find));


				out.println();
				out.println();

	}
}



