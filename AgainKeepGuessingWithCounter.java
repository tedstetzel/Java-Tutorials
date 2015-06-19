import java.util.Scanner;
import java.util.Random;

public class AgainKeepGuessingWithCounter
{
	public static void main(String[] args)
	{
	
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	int number = 1 + r.nextInt(10);
	int guess;
	int i = 1;
	
	System.out.println("I'm thinking of a number from 1 to 10");
	System.out.println("Your guess: ");
	guess = keyboard.nextInt();
	
	do
		{
		System.out.println("\nThat is incorrect. Guess again.");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		i++;
		}
	
	while (guess != number);
	
	System.out.println("That's right! It took you " + i + " tries. You are a good guesser.");

	}
}
		