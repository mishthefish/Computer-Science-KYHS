//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   OddEvenCounter test = new OddEvenCounter();
	   Scanner keyboard = new Scanner(System.in);
	   out.println("What are the numbers ?");
	   String bro  = keyboard.nextLine();
	   test.setLine(bro);
	   
	   out.println(test);
	}
}