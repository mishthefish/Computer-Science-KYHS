//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		FancyWords vraj = new FancyWords("2003 TCEA STATE CONTEST");
		System.out.println(vraj.toString(true));

		vraj.setString("PROGRAMMING IS FUN");

		System.out.println(vraj.toString(true));

		vraj.setString("TODAY IS SATURDAY");
		System.out.println(vraj.toString(true));
	}
}