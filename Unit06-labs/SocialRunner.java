//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;


public class SocialRunner
{
	public static void main( String args[] )
	{
		
		Social test = new Social("456-56-234");

		test.setWord("456-56-234");
		test.chopAndAdd();
		System.out.println(test);
		
		
		test.setWord("1-1-1");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("102-2-12");
		test.chopAndAdd();
		System.out.println(test);

		test.setWord("0-0-0");
		test.chopAndAdd();
		System.out.println(test);

		
	}
}