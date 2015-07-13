import java.util.Scanner;

public class TitleGame
{
	public static void main(String[] Args)
	{
		String gender;
		String firstName = "";
		String lastName = "";
		String status = "";
		short age;
		String salutation = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your Gender (M or F): ");
		gender = keyboard.next();
		
		System.out.print("First name: ");
		firstName = keyboard.next();

		System.out.print("Last name: ");
		lastName = keyboard.next();
		
		System.out.print("Age: ");
		age = keyboard.nextShort();
		
		System.out.print("");
		
			if (age > 20)
			{
			System.out.println("Are you married " + firstName + " (y or n)?");
			status = keyboard.next();
			
				if (gender.equals("M"))
				{
				salutation = "Mr. ";
				}
				
				else if (gender.equals("F"))
				{
				
					if (status.equals("y"))
					{
					
					salutation = "Mrs.";
					
					}

					else if (status.equals("n"))
					{
					salutation = "Ms.";
					}
				
				
				}		
			
			
			
			
			}
		
		if (salutation.equals(""))
		{
		System.out.print("");
		System.out.print("Then I shall call you " + firstName + " " + lastName);
		}
		
		else
		{
		System.out.print("");
		System.out.print("Then I shall call you " + salutation +  " " + lastName);
		}
	}
	
}