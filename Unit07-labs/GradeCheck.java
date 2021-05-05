//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(in);
		
		
		
		for ( int i = 0; i < 4; i++)
		{
			out.print("Enter a number grade :: ");
			int gradeNum = keyboard.nextInt();
			Grade test = new Grade(gradeNum);
			out.print(test);
		}
		
		
		
		
		
		
	}
}