import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
			
		int countFrom, countTo, countBy;
			
			
		System.out.print("Count from: ");
		countFrom= keyboard.nextInt();
		
		System.out.print("Count to: ");
		countTo= keyboard.nextInt();

		System.out.print("Count by: ");
		countBy= keyboard.nextInt();		
		
		for(int i = countFrom; i <= countTo; i = i + countBy)
		{
			System.out.print( i + " ");
		}
	}
}