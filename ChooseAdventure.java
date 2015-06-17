import java.util.Scanner;

public class ChooseAdventure 
{
	public static void main(String[] args)
	{
		String q1, q2, q3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("WELCOME TO A JAVA ADVENTURE");
		
		System.out.println("");
		
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or go into the \"kitchen\"?");
		
		q1 = keyboard.next();
		
		if (q1.equals("upstairs"))
		{//upstairs
	 
			System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\" There is also a \"bathroom\" off of the hallway. ");
			q2 = keyboard.next();	
		
				if (q2.equals("bathroom"))
				{
				//upstairs bathroom
				
					System.out.println("In the bathroom there is a old shower curtian obscuring what is in the bathtub. Do you want to open the curtain (\"yes\" or \"no\")");
					q3 = keyboard.next();
						
						if (q3.equals("yes"))
						{//upstairs bathroom yes
							System.out.println("That's rude, someone could be taking a bath");
						}
						
						else if (q3.equals("no"))
						{//upstairs bathroom no
							System.out.println("good idea, someone could be taking a bath");
						}
						
				
				}
			
				else if (q2.equals("bedroom"))
				{
					//upstairs bedroom 
					System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
					q3 = keyboard.next();
						
						if (q3.equals("yes"))
						{	//upstairs bedroom  yes
							System.out.println("There are some pretty nice clothes in here");
						}
						
						else if (q3.equals("no"))
						{	//upstairs bedroom  no
							System.out.println("Well I guess you'll never know what's in there. Thanks for playing");
						}
				}
			
			}
		 
		
		
		
		else if (q1.equals("kitchen"))
		{//kitchen
		
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one sire there is, as you would expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". ");
		 
			q2 = keyboard.next();	
		
				if (q2.equals("refrigerator"))
				{
				//kitchen refrigerator
				
					System.out.println("There is some really old dusty food in here. Do you want to eat it? (\"yes\" or \"no\")");
					q3 = keyboard.next();
						
						if (q3.equals("yes"))
						{//kitchen refrigerator yes
							System.out.println("Tastes good. You feel better and walk back outside. Thanks for playing");
						}
						
						else if (q3.equals("no"))
						{//kitchen refrigerator no
							System.out.println("Well then don't. You die of starvation, eventually");
						}
					
				
				}
				
				else if (q2.equals("cabinet"))
				{
				//kitchen refrigerator
				
					System.out.println("There is some really old dusty food in here. Do you want to eat it? (\"yes\" or \"no\")");
					q3 = keyboard.next();
						
						if (q3.equals("yes"))
						{//kitchen refrigerator yes
							System.out.println("Tastes good. You feel better and walk back outside. Thanks for playing");
						}
						
						else if (q3.equals("no"))
						{//kitchen refrigerator no
							System.out.println("Well then don't. You die of starvation, eventually");
						}
					
				
				}
		
		
		}
			System.out.println("Nested if statements are the worst. Hope you had fun");
	}
}		