import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args)
	{
	
	double weight; 
	int planet ;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please enter your current earth weight");
	weight = keyboard.nextDouble();
	
	System.out.println("");	
	System.out.println("I have information for the following planets:");	
	System.out.println("      1. Venus    2. Mars    3. Jupiter");	
	System.out.println("      4. Saturn   5. Uranus  6. Neptune");	
	System.out.println("");
	System.out.print("Which platnet are you visiting?");
	planet = keyboard.nextInt();

	
	if (planet == 1)
	{
	 weight = weight * .78;
	}
	else if (planet == 2)
	{
	 weight = weight * .39;
	}
	else if (planet == 3)
	{
	 weight = weight * 2.65;
	}
	else if (planet == 4)
	{
	 weight = weight * 1.17;
	}
	else if (planet == 5)
	{
	 weight = weight * 1.05;
	}
	else if (planet == 6)
	{
	 weight = weight * 1.23;
	}
	else 
	{
	 weight = weight * 1;
	}
	
	
	System.out.println("");
	System.out.print("Your weight would be " + weight + " on that planet.");
	}
}