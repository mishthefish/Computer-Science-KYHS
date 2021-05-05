//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private String [] hi;

	public Name()
	{
		
		name = " ";
	}

	public Name(String s)
	{
		name = s; 
		 hi=name.split(" ");
	}

   public void setName(String s)
   {
	   name = s;
	   hi = name.split(" ");
	   
   }

	public String getFirst()
	{
		
		return hi[0];
	}

	public String getLast()
	{
		return hi[1];
	}

 	public String toString()
 	{
 		return name;
	}
}

