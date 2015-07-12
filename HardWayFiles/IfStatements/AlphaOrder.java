import java.util.Scanner;

public class AlphaOrder
{
	public static void main(String[] args)
	{
	
		String lastName;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("What is your last name? ");
		lastName = keyboard.next();

		
		System.out.println(lastName.compareTo(lastName));
		
		
		if (lastName.compareTo("Carswell")  < 0)
		{
		System.out.println("Shouldn't be long");
		}
		else if (lastName.compareTo("Carswell")  > lastName.compareTo("Jones") )
		
		
		System.out.println(lastName.compareTo("Carswell"));
		System.out.println(lastName.compareTo("Jones"));
		System.out.println(lastName.compareTo("Smith"));
		System.out.println(lastName.compareTo("Young"));

	}
}