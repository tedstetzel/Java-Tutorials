import java.util.Scanner;

public class HowOldAreYouSpecifically
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Hey, what's your name?");
		name = keyboard.next();
		
		System.out.print("OK " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		//Blank line before results
		System.out.println(" ");
		
		if (age < 16)
		{
			System.out.println("You can't drive");
		}
		else if ((age == 17) || (age == 16))
		{
			System.out.println("You can drive but you can't vote");
		}
		else if ((age >= 18) && (age <= 24))
		{
			System.out.println("You can vote but not rent a car");
		}
		else
		{
			System.out.println("You can pretty much do anything legal");
		}
	
	}
}
		
