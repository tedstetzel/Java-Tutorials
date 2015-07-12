import java.util.Scanner;

public class PinLockout
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int numOfTries = 3;
		
		System.out.println("WELCOME TO THE BANK OF COMMAND LINE JAVA");
		System.out.print("PLEASE ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		
		int i = 0;
		
		while (entry != pin && i < numOfTries)
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("PLEASE ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			i++;
		}
		
		if (entry == pin)
		{
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}
		else if (entry != pin)
		{
		System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
		}
		
	}
}