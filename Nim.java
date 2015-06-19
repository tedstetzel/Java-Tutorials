import java.util.Scanner;

public class Nim
{
	public static void main(String[] Args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		int numChoice = 0;
		int done = 0;
		int turn = 1;
		
		String pileChoice = "";
		String player1Name;
		String player2Name;
		String playerUp;
		

		System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
	
		System.out.print("Player 1 name: ");
		player1Name = keyboard.next();
		
		System.out.print("Player 2 name: ");
		player2Name = keyboard.next();
	
		playerUp = player1Name;
		
		do
		{
			
			if (turn % 2 == 0)
			{
				playerUp = player2Name;
			}
			else
			{
				playerUp = player1Name;
			}
			System.out.println(" ");
			System.out.println("-----------------------------");	
			System.out.print(playerUp + " choose a pile: ");
			pileChoice = keyboard.next();
			
			System.out.print("How many to remove from pile " + pileChoice + ":" );
			numChoice = keyboard.nextInt ();
			
			if (pileChoice.equals("A") && pileA >= 1)
			{
			pileA = pileA - numChoice; 
			}
			
			else if (pileChoice.equals("B") && pileB >= 1)
			{
			pileB = pileB - numChoice;
			}
			
			else if (pileChoice.equals("C") && pileC >= 1)
			{
			pileC = pileC - numChoice;
			}
			
			if (pileA < 1 && pileB < 1 && pileC < 1)
			{
			done = 1;
			}
			
			System.out.println("");
			System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC );
			System.out.println("Done = " + done);
			
			turn++;
			
		}
		while (done == 0);
		
		if (turn % 2 == 0)
		{
			playerUp = player2Name;
		}
		else
		{
			playerUp = player1Name;
		}
		
		
		
		System.out.println("All of the piles are empty. " + playerUp + " wins");
	}
}