//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringFirstLetterCheck(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public String checkFirstLetter( )
	{
		if (wordOne.charAt(0) == wordTwo.charAt(0))
		{
			return wordOne + " does have the same first letter as " + wordTwo + "\n\n";
			
		}
		else
		{
			return wordOne + " does not have the same first letter as " + wordTwo + "\n \n";
		}
		
	}
}
	