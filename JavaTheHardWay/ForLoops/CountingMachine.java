import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Count to: ");
		int number = keyboard.nextInt();
		
		for(int i = 1; i <= number; i++)
		{
			System.out.print(i + " ");
		}
	}
}