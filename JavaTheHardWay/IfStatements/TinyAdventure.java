import java.util.Scanner;

public class TinyAdventure2
{
	public static void main(String[] args)
	{
		String choice = "";
		String currentLocation ="";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tiny Adventure 2 \n");
		
		do
		{
		
		if (currentLocation.equals(""))
		{
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen?\"")
		choice = keyboard.next();
		
		}
		else if	(currentLocation.equals("kitchen")
		{
		System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"or go \"back\" ");
		choice = keyboard.next();
			if (choice.equals("back"))
			{
				choice = "";
			}
		}
		else if	(currentLocation.equals("upstairs")
		{
		System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"or go \"back\" ");
		choice = keyboard.next();
			if (choice.equals("back"))
			{
				choice = "";
			}
		}
		
		}
		System.out.println("-------------------------------------");	
		System.out.println("---------------The End---------------");
		System.out.println("-------------------------------------");
	}	
}
		
		