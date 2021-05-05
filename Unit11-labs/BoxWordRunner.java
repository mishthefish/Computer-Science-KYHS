//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("Enter a word to become a box : ");
				String big = keyboard.next();
				

					//instantiate a TriangleTwo object
				BoxWord tw = new BoxWord(big);
	         	//call the toString method to print the triangle 
				System.out.println( tw );

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
	}
}