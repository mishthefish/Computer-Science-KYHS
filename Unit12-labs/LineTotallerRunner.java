//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
	   LineTotaller test = new LineTotaller();
	   Scanner keyboard = new Scanner(System.in);
	   out.println("What are the numbers ?");
	   String bro = keyboard.nextLine();
	   test.setLine(bro);
	   out.println(test);
	   
	}
}