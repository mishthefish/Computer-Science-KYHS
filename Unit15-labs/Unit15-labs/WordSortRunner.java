//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		
		System.out.println("Lab Chapter 15 - #1  WordSort    2021");
		System.out.println();
		System.out.println();

		// ***** fill in your name
		System.out.println("My name is Mishael Sommers");
		System.out.println();
		System.out.println();





		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		System.out.println(test);
		test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		System.out.println(test);
		test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		System.out.println(test);

		test.setList("b x 4 r s y $");
		// now we print the return value of our toString() method
		System.out.println(test);
		
	}
}