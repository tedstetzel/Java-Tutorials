import java.util.Scanner;

public class WorstNumberGame
{
	public static void main(String[] args)
	{
	
	int number = 8;
	int guess;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("This is a bad guessing game for a section of if statmentes that should have ended about 5 excercises ago. Have fun");
	System.out.println("");
	System.out.print("I'm thinking of a number between 1 - 10. Try to guess: ");
	guess = keyboard.nextInt();
	
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
		