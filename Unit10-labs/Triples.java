//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int a, b, c;
   private String output = "";

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number =num;


	}

	public void setNum(int num)
	{
		number = num;

	}
	
	
	public void greatestCommonFactor() {
		 int max = number;
	        
	       out.print(" Hello Maayan! These are the Pythagoreon triples until " + max );
	        for (a = 1; a <= max; a++) {
	            for (b = a; b <= max; b++) {
	                for (c = 1; c <= max; c++) {
	                    if (a * a + b * b == c * c) {
	                        output = output + "\n" + a + ", " + b + ", " + c;
	                        
	                    }
	                   
	                    else
	                        continue;                  
	                }
	            }
	        }
	    }   
	

	public String toString(){
		
		
		
		return output+"\n";
	}
}