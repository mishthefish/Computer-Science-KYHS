//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(in);
		
		System.out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		
		
		System.out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		
		System.out.print("Enter c :: ");
		int quadC = keyboard.nextInt();
		
		
		
		Quadratic test = new Quadratic(quadA, quadB,quadC);
		test.calcRoots();
		test.print();
		
		
		

   	
   	
		
		
	}
}