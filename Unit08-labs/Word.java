//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		char first = word.charAt(0);
		return first;
		
	}

	public char getLastChar()
	{
		char last = word.charAt(word.length() - 1);
		return last;
	}

	public String getBackWards()
	{
		String back="";
		for ( int i = word.length() - 1; i >=0; i--)
		{
			back += word.charAt(i);
		}
		
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + " \n" + getLastChar() + "\n" + getBackWards() + "\n" ;
	}
}