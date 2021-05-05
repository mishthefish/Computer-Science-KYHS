//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {
	   LineCounter test = new LineCounter();
	   Scanner keyboard = new Scanner(System.in);
	   out.println("What are the numbers ?");
	   String sen = keyboard.nextLine();
	   test.setLine(sen);
	   
	   out.println(test);
	   
	   
	}
}