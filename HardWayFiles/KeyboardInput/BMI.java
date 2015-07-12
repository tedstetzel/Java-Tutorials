import java.util.Scanner;

public class BMI
{
	public static void main(String[] args)
	{
	
	Scanner keyboard = new Scanner(System.in);
	float height;
	int weight;
	
	System.out.print("Your height in m: ");
	height = keyboard.nextFloat();
	
	System.out.print("Your weight in pounds: ");
	weight = keyboard.nextInt();
	
	System.out.println(" ");
	System.out.println("Your BMI is: " + ( (height / weight) * 1000) );
	}
}
	
	
	