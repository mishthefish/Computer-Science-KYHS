//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthRunner
{
	public static void main( String args[] )
	{
		StringLengthCheck test = new StringLengthCheck("hello", "goodbye");
		test.setWords("hello","goodbye");
		
		out.print(test);
		
		
		test.setWords("one", "two");
		
		out.print(test);
		
		test.setWords("three" ,"four");
		
		out.print(test);
		
		test.setWords("TCEA","UIL");
		
		out.print(test);
		
		
		
				
	}
}