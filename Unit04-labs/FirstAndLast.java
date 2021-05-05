//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;
	String y;
	String x;
	  
	
	public FirstAndLast(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		String y = word.substring(0,1);
		return y;
	}
	
	public String getLast()
	{
		int len = word.length();
		String x = word.substring(len - 1, len);
		return x;
		
		
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}