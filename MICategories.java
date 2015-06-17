import Java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		float height, weight, bmi;
		
		System.out.print("Your height in m: ");
		height = keyboard.nextFloat();
		
		System.out.print(Your weight in kg: ");
		weight = keyboard.nextFloat();
		
		bmi = weight/height^2;
	
		System.out.print("Your BMI is: " + bmi);
	}
}