import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Starting number: ");
		int startingNumber = keyboard.nextInt();
		int i = 0;
		int biggestValue = 0;
		
		
			do 
			{
				
				if ((startingNumber % 2) == 0) //number is even
				{
					startingNumber = startingNumber/2;
					System.out.print(startingNumber + "\t");
					i++;
				}
				
				else 
				{
					startingNumber = (startingNumber * 3) + 1;
					System.out.print(startingNumber + "\t");
					i++;
				}
				
				if (startingNumber > biggestValue)
				{
					biggestValue = startingNumber;
				}
				
			}
			while (startingNumber != 1);
			
			System.out.println("\n-------------------------------------------------");
			System.out.println("Terminated after " + i + " steps.");
			System.out.println("The largest value was " + biggestValue );
		
	}
}