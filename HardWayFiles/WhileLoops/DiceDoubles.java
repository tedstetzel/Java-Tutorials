import java.util.Random;

public class DiceDoubles
{
	public static void main(String[] args)
	{
	
		Random r = new Random();
		
		int roll1 = 1;
		int roll2 = 2;
		int i =0;
		System.out.println("Here come the dice!");
		System.out.println("");

		while (roll1 != roll2)
		{
		
		roll1 = 1 + r.nextInt(6);
		roll2 = 1 + r.nextInt(6);
		
		System.out.println("Roll #1: " + roll1);
		System.out.println("Roll #2: " + roll2);
		System.out.println("The total is  " + (roll1 + roll2));
		System.out.println("");
		i++;
		
		}
		System.out.println("");
		System.out.println("It took " + i + " rolls to get doubles.");
	}
}