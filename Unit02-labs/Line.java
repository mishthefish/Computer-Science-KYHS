//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
}

	public void calculateSlope( )
	{
		slope = (yTwo - yOne) / (xTwo - yOne);


	}

	public void print( )
	{
		System.out.printf("the slope is %.3f", slope);



	}
}