//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*; 

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter 1st monster's name : ");
		String monNameOne = keyboard.nextLine();
		out.print("Enter 1nd monster's size : ");
		int monSizeOne = keyboard.nextInt();
		keyboard.nextLine();
		
		
		
		
		
		out.print("Enter 2nd monster's name : ");
		String monNameTwo = keyboard.nextLine();
		out.print("Enter 2nd monster's size : " );
		int monSizeTwo = keyboard.nextInt();
		keyboard.nextLine();
		
		
		Monster monster1 = new Monster ( monNameOne, monSizeOne);
		Monster monster2 = new Monster ( monNameTwo, monSizeTwo);
		
		
		
		
		
		System.out.println("Monster 1 - " + monster1.toString() + "\n" + "Monster 2 - " + monster2.toString() + "\n\n");
		
		if(monster1.namesTheSame(monster2))
	      {
	        System.out.println("Monster 1 HAVE THE SAME NAME as Monster 2");
	      }
	      else
	      {
	        System.out.println("Monster 1 DOESNT THE SAME NAME as Monster 2");
	      }

	      if(monster1.isBigger(monster2))
	      {
	        System.out.println("Monster 1 IS BIGGER THAN Monster 2");
	      }
	      else if(monster1.isSmaller(monster2))
	      {
	        System.out.println("Monster 1 IS SMALLER THAN Monster 2");
	      }
	      else
	      {
	        System.out.println("Monster 1 HAS THE SAME NAME as Monster 2");
	      }

	}
}