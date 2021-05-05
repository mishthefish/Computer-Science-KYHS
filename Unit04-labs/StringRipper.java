//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	String returnString;
	
	public StringRipper()
	{
		setString("");
		word = "";
	}

	public StringRipper(String s)
	{
		word = s;
	}
	
   public void setString(String s)
   {
	   word = s;
   }	

	public String ripString(int x, int y)
	{
		String returnString = word.substring(x,y);
		return returnString;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
 	
 	public String print()
 	{
 		return word;
 	}
}