//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
		ArrayList<Integer> fuck; 
		fuck = new ArrayList<Integer>();
		for ( int i = 2; i < number; i++)
		{
			if ( number % i == 0 )
			{
				fuck.add(i);
			}
		}
		
		
		return fuck;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
		for (int i = 0; i < nums.size(); i++) {
            if (isPrime(nums.get(i))) {
                nums.remove(i);
                i--;
            }
        }	
	}
	
	 private static boolean isPrime(Integer n) {
	        for (int i = 2; i < n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}