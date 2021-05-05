//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		StringFirstLetterCheck test = new StringFirstLetterCheck("hello", "howdy");
		test.setWords("hello", "howdy" );
		out.print(test.checkFirstLetter());
		
		
		test.setWords("three", "two" );
		out.print(test.checkFirstLetter());
		
		test.setWords("TCEA", "UIL" );
		out.print(test.checkFirstLetter());
		
		test.setWords("State" , "Champions" );
		out.print(test.checkFirstLetter());
		
	}
}







