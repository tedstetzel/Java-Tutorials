import java.util.Scanner;

public class AddingValuesInLoop
{
	public static void main(String[] args)
	{
		int total = 0;
		int current = 1;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("I will add up the numbers you give me.");
		
		while (current != 0)
		{
		System.out.print("Number: ");
		current = keyboard.nextInt();
		total = total + current;
		
		if (current != 0)
		{
		System.out.println("The total so far is " + total);
		}
		}
		
		System.out.println("");
		System.out.println("The total is " + total);
	}
}	