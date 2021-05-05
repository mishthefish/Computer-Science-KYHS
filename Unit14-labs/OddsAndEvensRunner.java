import java.util.Arrays;
import java.util.Scanner;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		int [] one = {2,4,6,8,10,12,14};
		int [] two = {1,2,3,4,5,6,7,8,9};

		
		System.out.println("Odds  - " + Arrays.toString(OddsAndEvens.getAllOdds(one)));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(one)));
		System.out.println();
		
		
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(two)));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(two)));
		System.out.println();
		
		 // look how else we can do this! 
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{2,10,20,21,23,24,40,55,60,61})));
		System.out.println("Evens  - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{2,10,20,21,23,24,40,55,60,61})));
		
	}
}