import java.util.Scanner;

public class CountingFor
{
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		// n = 1 creates the counter
		// n <=5 is the condition that will stop the loop
		// n = n+1 is the increment for each loop
		for (int n = 2 ; n <=10; n = n+2)
		{
			System.out.println(n+ ". " + message);
		}
	}
}
		
		
		
		
		
		
		
	