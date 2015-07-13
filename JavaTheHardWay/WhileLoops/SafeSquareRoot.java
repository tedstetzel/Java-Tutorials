import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT TIME!");
		int number = 1;
		
		do
		{
			System.out.print("Enter a number: ");
			number = keyboard.nextInt();
			
			if (number > 0)
			{
				System.out.println("The square root of " + number + " is " + Math.sqrt(number));
			}
		
			else if (number < 0)
			{
				System.out.println("You can't take the square root of a negative number. Please provide a positive number.");
			}
		
		}
		
		while( number != 0);
	}
}	
	
	
	
	