/*
Started this. Might come back to it later. 

*/

import java.util.Scanner;

public class TinyAdventure2
{
	public static void main(String[] args)
	{
		String choice = "";
		String currentLocation ="";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tiny Adventure 2 \n");
		String done = "false";
		
		do
		{
		
			if (choice.equals(""))
			{
				System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen?\"");
				choice = keyboard.next();
			}
			
			else if	(choice.equals("kitchen"))
			{
				System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\"or go \"back\" ");
				choice = keyboard.next();
					if (choice.equals("back"))
					{
						choice = "";
					}
			}
			else if	(choice.equals("upstairs"))
			{
				System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Or, you can go back \"downstairs\". Where would you like to go?");
				choice = keyboard.next();
				if (choice.equals("downstairs"))
				{
					choice = "";
				}
			}
			
			else if	(choice.equals("refrigerator"))
			{
			System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty\n Would you like to eat some of the food? (\"yes\" or \"no\") or go \"back\" ");
			choice = keyboard.next();
				if (choice.equals("back"))
				{
					choice = "kitchen";
				}
				else if (choice.equals("yes"))
				{
					System.out.println("The food is slimy and foul, but you manage to choke it down. You pass out. Game over");
					done = "true";
				}
				else if (choice.equals("no"))
				{
					System.out.println("You are extremely hungery. You pass out. Game over");
					done = "true";
				}
			}
			
		
		}
		while(done.equals("false"));
		
		System.out.println("-------------------------------------");	
		System.out.println("---------------The End---------------");
		System.out.println("-------------------------------------");
	}	
}
		
		