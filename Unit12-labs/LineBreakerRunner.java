//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
	   LineBreaker test = new LineBreaker();
	   Scanner keyboard = new Scanner(System.in);
	   out.println("What is the input?");
	   String bro  = keyboard.nextLine();
	   out.println("How many to divide into?");
	   int dad = keyboard.nextInt();
	   test.setLineBreaker(bro,dad);
	   
	   out.println(test);
	}
}