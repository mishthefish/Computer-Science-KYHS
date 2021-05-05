//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String legitPassword;

	public PasswordCheck(String password)
	{
		legitPassword = password;
	}

	
	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		boolean checker = false;
		do
			{
			 out.println("Enter the password :: ");
			 input = keyboard.nextLine();
			 if ( input.equals(legitPassword))
			 {
				 out.println("VALID");
				 checker = true;
				 
			 }
			 else
			 {
				out.println("INVALID");
				
			 }
			
			}while(!checker);
	}
}
