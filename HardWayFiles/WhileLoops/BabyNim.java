import java.util.Scanner;

public class BabyNim
{
	public static void main(String[] Args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int pileA = 3;
		int pileB = 3;
		int pileC = 3;
		String pileChoice = "";
		int numChoice = 0;
		int done = 0;
		
		System.out.println("A: " + pileA + "\tB: " + pileB + "\tC: " + pileC);
	
		do
		{
			System.out.print("Choose a pile: ");
			pileChoice = keyboard.next();
			
			System.out.print("How many to remove from pile " + pileChoice + ":" );
			numChoice = keyboard.nextInt ();
			
			if (pileChoice.equals("A"))
			{
			pileA = pileA - numChoice; 
			}
			
			else if (pileChoice.equals("B"))
			{
			pileB = pileB - numChoice;
			}
			
			else if (pileChoice.equals("C"))
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
			
		}
		while (done == 0);
		
		System.out.println("All of the piles are empty. Good job!");
	}
}