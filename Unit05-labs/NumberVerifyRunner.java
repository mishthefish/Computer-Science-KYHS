//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		
		Scanner keyboard = new Scanner(in);
		out.print("Enter a whole number :: ");
		 int num = keyboard.nextInt();
		 
		 
		 NumberVerify heybro = new NumberVerify(num);
		 heybro.isOdd();
		 heybro.isEven();
		 
		 
		 //add in more test cases
	}
}