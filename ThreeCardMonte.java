import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int card = 1 + r.nextInt(3);
		int guess;
		
		System.out.println("*-------------------------------------------*");
		System.out.println("");
		System.out.println("Let's play three card monte. You have a 1/3 chance of winning and you don't have to go down to Market St."); 
		System.out.println("");
		System.out.println("Here are three cards.");
		System.out.println("");
		System.out.println("          ##  ##  ##");
		System.out.println("          ##  ##  ##");
		System.out.println("          1   2   3 ");
		System.out.println("");
		
		System.out.println("Which one is the Ace?");
		
		guess = keyboard.nextInt();
		
		if (card == 1)
		{
		System.out.println("          AA  ##  ##");
		System.out.println("          AA  ##  ##");
		System.out.println("          1   2   3 ");
		
		
		}
		
		else if (card == 2)
		{
		System.out.println("          ##  AA  ##");
		System.out.println("          ##  AA  ##");
		System.out.println("          1   2   3 ");
		
		
		}
		
		else if (card == 3)
		{
		
		System.out.println("          ##  ##  AA");
		System.out.println("          ##  ##  AA");
		System.out.println("          1   2   3 ");
		
		}
		
		System.out.println("");
		if (guess == card) 
		{
		System.out.println("You won! Here is your money");
		
		}
		else if (guess != card)
		{
		System.out.println("You lost. Better luck next time pal.");
		
		}

	}
}	