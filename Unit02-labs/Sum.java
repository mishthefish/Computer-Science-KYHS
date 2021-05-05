//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Sum
{
	private double sum;
	private double one;
	private double two;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
	}

	public void sum()
	{
		 sum = one+two;
	}

	public void print( )
	{
		System.out.println(one +" + "+ two + " == " +sum);
		
	}
}
