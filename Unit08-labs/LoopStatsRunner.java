//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats(1,5);
		out.println(test);
		out.println("total " + test.getTotal());
		out.println("even count " + test.getEvenCount());
		out.println("odd count " + test.getOddCount());
	}
}