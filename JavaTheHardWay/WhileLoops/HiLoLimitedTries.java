import java.util.Scanner;
import java.util.Random;

public class HiLoLimitedTries
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int guess = 0; 
		int number = 1 + r.nextInt(100);
		int numberOfTries = 7;
		int i = 0;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		
		
		while (number != guess && i < numberOfTries)
		{
		  guess = keyboard.nextInt();
			if (number == guess)
			{
			System.out.println("You guessed it! Pretty amazing. It took you " + numberOfTries + " tries"); 
			}
			else if (number > guess)
			{
			System.out.println("Too low"); 
			}		
			else if (number < guess)
			{
			System.out.println("Too high.");
			}
			
			i++;
		}
	
		if (number != guess)
		{
		System.out.println("Sorry you didn't get it in " + numberOfTries + " tries.");
		}
	}
}
		