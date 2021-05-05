//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		demo.add();
		out.println();
		demo.print();
		out.println("sum :: " + demo.toString());

		demo.setStrings("jim","bob");
		demo.add();
		demo.print();
		out.println("sum :: " + demo.toString());

		//add more test cases		
	}
}