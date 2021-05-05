//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

   public StringRemover()
	{
		sentence = "";
		remove = "";
	}

   public StringRemover(String a, String b)
	{
		sentence = a;
		remove = b;
	}

	public void setRemover(String s, String rem)
	{
		sentence = s;
		remove = rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		
		while(cleaned.indexOf(remove) > 0)
		{
			String newRemove = sentence.charAt(sentence.indexOf(remove) -1 ) + remove;
			
			cleaned = cleaned.replaceAll(newRemove, "");
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - String to remove " + remove + "\n" + removeStrings();
	}
}