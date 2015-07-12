import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main(String[] args)
	{
	
	int side1 = 0;
	int side2 = 0;
	int side3 = 0;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter three integers: ");
	System.out.print("Side 1: ");
	side1 = keyboard.nextInt();
	
	do
	{
	System.out.print("Side 2: ");
	side2 = keyboard.nextInt();
	
	}
	while (side1 > side2);

	do
	{
	System.out.print("Side 3: ");
	side3 = keyboard.nextInt();
	
	}
	while (side3 > side3);
	
	System.out.println("Your three sides are: " + side1 +" "+ side2 +" "+ side3);
	
	if ((side1*side1) + (side2*side2) == (side3*side3))
	{
	System.out.println("These three *do* sides make a right triangle");
	}
	else 
	{
	System.out.println("These sides oo not make a right triangle");
	}
	
	}

	
	
}