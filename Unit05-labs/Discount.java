//© A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	double ogBill;
	
	public Discount()
	{
		ogBill = 0.0;
	}
	
	public Discount( double amt)
	{
		ogBill = amt;
		
	}
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public void getDiscountedBill()
	{
		if ( ogBill > 2000 )
		{
			ogBill = ogBill - ogBill * 0.15;
			out.println("Bill after discount :: " + ogBill);
		}
		else
		{
			out.println("Bill after discount :: " + ogBill);
		}
	}
}