//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence ="";
		lookFor = 0;
		
	}

	public LetterRemover(String a, char b)
	{
		sentence = a;
		lookFor = b;
		
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		cleaned = sentence.replaceAll(lookFor + "", "");
		
		
		
		
		
		
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}