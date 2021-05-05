//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
   {
	   Average test = new Average();
	   Scanner keyboard = new Scanner(System.in);
	   out.println("What are the numbers ?");
	   String cool  = keyboard.nextLine();
	   test.setLine(cool);
	   
	   out.println(test);
	   
	   
	   out.println("What are the numbers ?");
	   String may  = keyboard.nextLine();
	   test.setLine(may);
	   
	   out.println(test);
	   
	   
	   
	   
	   
	}
}