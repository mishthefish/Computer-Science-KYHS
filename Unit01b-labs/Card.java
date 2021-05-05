//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

		String suit;
		int face;
		String cool;
		
		
		

		public Card(String sui, int fac) 
		{
			suit = sui;
			face = fac;
			
		};
		public Integer setFace(int fac)
		{
			face = fac; 
			return face; 
			
		}
		
		public  String getSuit()
		{
			return suit;  
			
		}
		
		public Integer getFace()
		{
			return face; 
			
		}
		
		
		
		
		public String cool()
		
		{
			
			
			if(face == 1)
			{
				
				cool = "ACE";
			}
			
			if (face == 4)
			{
				cool = "FOUR";
			}
			
			 if (face == 12)
			{
				cool = "QUEEN";
			}
			
			 if ( face == 3)
			{
				cool = "THREE";
			
			}
			 return cool + " of " + suit;
		
		}
		
		
		
		


	

  	

 }