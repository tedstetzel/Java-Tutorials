import java.util.Random;

public class BabyBlackJack
{
	public static void main(String[] args)
	{
		System.out.println("Baby Blackjack!\n");
		
		Random r = new Random();
		
		int playerCard1 = 1 + r.nextInt(10); 
		int playerCard2 = 1 + r.nextInt(10); 
		int dealerCard1 = 1 + r.nextInt(10);
		int dealerCard2 = 1 + r.nextInt(10);
		
		System.out.println("You drew " + playerCard1 + " and " + playerCard2 + ".");
		System.out.println("Your total is " + (playerCard1 + playerCard2 + ".\n"));
		
		System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2 + ".");
		System.out.println("Dealer's total is " + (dealerCard1 + dealerCard2 + ".\n"));
		
		if ((dealerCard1 + dealerCard2) < (playerCard1 + playerCard2))
		{
			System.out.println("YOU WIN!");
		}
		else if ((dealerCard1 + dealerCard2) == (playerCard1 + playerCard2))
		{
			System.out.println("Draw");
		}
		else if ((dealerCard1 + dealerCard2) > (playerCard1 + playerCard2))
		{
			System.out.println("You Lose");
		}
	}
}
		