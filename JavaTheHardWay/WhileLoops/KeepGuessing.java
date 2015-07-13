import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
	public static void main(String[] args)
	{
	
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	int number = r.nextInt(10);
	int guess;
	
	
	System.out.println("I'm thinking of a number from 1 to 10");
	System.out.println("Your guess: ");
	guess = keyboard.nextInt();
	
	while (guess != number)
		{
		System.out.println("\nThat is incorrect. Guess again.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		}
	
	System.out.println("That's right! You are a good guesser.");

	}
}
		