//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average()
	{
		average = (one + two) /2;

	}
	public void print()
	{
		System.out.println(one + " + " + two + " has an average of " + average);
	}
}