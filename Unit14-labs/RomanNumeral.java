//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 



public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{

		number = orig;

	}

	public void setNumber(Integer num)
	{


		number = num;

	}

	public void setRoman(String rom)
	{

		roman = rom;

	}

	
	public int value(char r)
    {
        if (r == 'I')
        {
            return 1;
        }
            
        if (r == 'V')
        {
            return 5;
        }
        if (r == 'X')
        {
            return 10;
        }
        if (r == 'L')
        {
            return 50;
        }
        if (r == 'C')
        {
            return 100;
        }
        if (r == 'D')
        {
            return 500;
        }
        if (r == 'M')
        {
            return 1000;
        }
        return -1;
    }


	
	public Integer getNumber()
	{
		
		 int res = 0;

	      for (int i=0; i<roman.length(); i++)
	      {
	         
	          int s1 = value(roman.charAt(i));
	          //not quite sure what this is, but its important!
	          if (i+1 <roman.length())
	          {
	              int s2 = value(roman.charAt(i+1));

	           
	              if (s1 >= s2)
	              {
	                  res = res + s1;
	              }
	              else
	              {
	                  res = res + s2 - s1;
	                  i++; 
	              }
	          }
	          else
	          {
	              res = res + s1;
	              i++;
	          }
	      }

	      return res;
	 }

	public String toString()
	{
		roman = "";
		int N = number;
		for ( int i = 0 ; i < NUMBERS.length; i++)
		{
			while(N >= NUMBERS[i])
			{
				roman += LETTERS [i];
				N -= NUMBERS[i];
				
			}
		}
		return roman + "\n";
	}
}