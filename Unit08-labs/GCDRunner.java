//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCDRunner
{
	public static void main ( String[] args )
	{
		GCD test = new GCD (5,25);
		out.println(test);
		test.setNums(4, 400);
		out.println(test);
		test.setNums(8, 80);
		out.println(test);
		test.setNums(15, 45);
		out.println(test);
	}
}