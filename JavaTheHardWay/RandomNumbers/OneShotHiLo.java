import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int guess; 
		int number = 1 + r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		guess = keyboard.nextInt();
		
		if (number == guess)
		{
		System.out.println("You guessed it! Pretty amazing."); 
		}
		else if (number > guess)
		{
		System.out.println("Too low. I was thinking of " + number); 
		}		
		else if (number < guess)
		{
		System.out.println("Too high. I was thinking of " + number); 
		}		
		else
		{
		System.out.println("There was an error");
		}
	}
}
		