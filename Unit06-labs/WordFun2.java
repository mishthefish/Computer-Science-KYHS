//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class WordFun2
{
	public static String moveEmAround(String a, int x)
	{
		
		 if(a.length()-1 >= x)
		    {
		      String output = a.substring(x) + a.substring(0,x);
		      return output;
		    }
		 else
		 {
			 return "no can do";
		 }
		
			
	}
}
