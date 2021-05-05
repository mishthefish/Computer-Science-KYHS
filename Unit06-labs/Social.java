//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 
///Doc is annoying

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		socialNum = "";
		sum = 0;
	}

	public Social(String soc)
	{
		socialNum = soc;
		
	}


	public void setWord(String w)
	{
		socialNum = w;
		sum=0;
	}

	public void chopAndAdd()
	{
		int dashPos = socialNum.indexOf("-");
		int secondDashPos = socialNum.lastIndexOf("-");
		
		String firstPart = socialNum.substring(0,dashPos);
		String secondPart = socialNum.substring(dashPos+1,secondDashPos );
		String thirdPart = socialNum.substring(secondDashPos+1);
		
		int firstPartInt = Integer.parseInt(firstPart);
		int secondPartInt = Integer.parseInt(secondPart);
		int thirdPartInt = Integer.parseInt(thirdPart);
		
		sum = firstPartInt + secondPartInt + thirdPartInt;
		
		
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}