import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame
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
	System.out.print("");
	
	if (guess == number);
	{
	System.out.println("You guessed it. It was " + number + "!");
	}
	if (guess != number)
	{
	System.out.println("Sorry, you missed it. It was " + number + "!");
	}

	}
}
		