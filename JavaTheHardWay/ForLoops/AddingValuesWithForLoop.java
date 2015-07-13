import java.util.Scanner;

public class AddingValuesWithForLoop
{
	public static void main(String [] args)
		{
			Scanner keyboard = new Scanner(System.in);
			int runningTotal = 0;
			int number;
			
			System.out.print("Number : ");
			number = keyboard.nextInt();
			System.out.println("");
			for (int i = 1; i <= number; i++)
			{
				System.out.print(i + " ");
			
				runningTotal = runningTotal + i;
			}
			
			System.out.println("\nThe sum is " + runningTotal);
		
		}
}