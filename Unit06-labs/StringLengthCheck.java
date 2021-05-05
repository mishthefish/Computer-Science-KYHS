//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthCheck
{
	String wordOne, wordTwo;

	public StringLengthCheck()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringLengthCheck(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkLength( )
	{
		
		
		return false;
	}

	public String toString()
	{
		if (wordOne.length() == wordTwo.length() )
		{
			return wordOne + " does have the same # of letters as " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
		}
		
	}
}