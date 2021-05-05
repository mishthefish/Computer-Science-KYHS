//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		
	   
	   
	   
	   Scanner keyboard = new Scanner (in);
	   out.print("What is the first String? ");
	   String input_WordOne = keyboard.next();
	   
	   out.print("What is the second String? ");
	   String input_WordTwo = keyboard.next();
	   
	   
	   WordsCompare bruh = new WordsCompare(input_WordOne, input_WordTwo);
	   bruh.compare();
	   out.print(bruh);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
	   
	   
	   
	   //add test cases

	}
}