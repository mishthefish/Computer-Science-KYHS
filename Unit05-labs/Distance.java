//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;


	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;


	}

	public void determineClosest()
	{
		double aDistance = Math.sqrt(Math.pow((x1 - 0),2) + Math.pow((y1 - 0), 2));
		double bDistance = Math.sqrt(Math.pow((x2 - 0),2) + Math.pow((y2 - 0), 2));
		
		if ( aDistance < bDistance)
		{
			out.print("A is closer to (0,0).");
		}
		
		if ( bDistance <  aDistance)
		{
			out.print("B is closer to (0,0).") ;
			
		}
	}
	
	
}