//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*; 

public class MorseCode
{
	private char letter;

	public MorseCode()
	{
		letter = 0;
	}

	public MorseCode(char let)
	{
		letter = let;
	}

	public void setChar(char let)
	{
		letter = let;
	}

	public String getMorseCode()
	{
		String morse="";
		switch(letter)
		{
			case 'A': morse = ".-"; break;
			case 'B': morse = "-..."; break;
			case 'C': morse = "-.-."; break;
			case 'D': morse = "-.."; break;
			case 'E': morse = "."; break;
			case 'F': morse = "..-."; break;
			case 'G': morse = "_ _ ."; break;
			case 'H': morse = ". . . ."; break;
			case 'I': morse = ". ."; break;
			case 'J': morse = ". _ _ _"; break;
			case 'K': morse = "_ . _"; break;
			case 'L': morse = ". _ . ."; break;
			case 'M': morse = "_ _"; break;
			case 'N': morse = "_ ."; break;
			case 'O': morse = "_ _ _"; break;
			case 'P': morse = ". _ _ ."; break;
			case 'Q': morse = "_ _ . _"; break;
			case 'R': morse = "	. _ .	"; break;
			case 'S': morse = ". . ."; break;
			case 'T': morse = "_"; break;
			case 'U': morse = ". . _	"; break;
			case 'V': morse = ". . . _"; break;
			case 'W': morse = ". _ _	"; break;
			case 'X': morse = "	_ . . _"; break;
			case 'Y': morse = "_ . _ _"; break;
			case 'Z': morse = "_ _ . ."; break;
			case '0': morse = "	_ _ _ _ _"; break;
			case '1': morse = ". _ _ _ _"; break;
			case '2': morse = ". . _ _ _"; break;
			case '3': morse = "	. . . _ _"; break;
			case '4': morse = "	. . . . _	"; break;
			case '5': morse = ". . . . .	"; break;
			case '6': morse = "	_ . . . .	"; break;
			case '7': morse = "_ _ . . ."; break;
			case '8': morse = "	_ _ _ . .	"; break;
			case '9': morse = "	_ _ _ _ ."; break;
			
		}
		
		
		
		
		
		return morse;		
	}

	public String toString()
	{
		return letter + " is " + getMorseCode() + " in morse!\n";
	}
}