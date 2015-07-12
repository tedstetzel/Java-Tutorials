import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		float height, weight, bmi;
		String bmiCategory;
		bmiCategory = "";
		
		System.out.print("Your height in m: ");
		height = keyboard.nextFloat();
		
		System.out.print("Your weight in kg: ");
		weight = keyboard.nextFloat();
		
		bmi = weight/(height*height);
	
		System.out.println(" ");
		System.out.println("Your BMI is: " + bmi);
	
		if (bmi < 15)
		{
		bmiCategory = "very severely underweight";
		}
		
		if ((bmi > 15) && (bmi <=16)) 
		{
		bmiCategory = "severely underweight";
		}
	
		if ((bmi >= 16)  && (bmi <=18.4)) 
		{
		bmiCategory = "underweight";
		}
	
		if ((bmi >= 18.5)  && (bmi <=24.9)) 
		{
		bmiCategory = "normal weight";
		}
	
		if ((bmi >= 25.0)  && (bmi <=29.9)) 
		{
		bmiCategory = "overweight";
		}
		if ((bmi >= 30.0)  && (bmi <=34.9))
		{
		bmiCategory = "moderately obese";
		}	
		if ((bmi >= 35.0)  && (bmi <=39.9)) 
		{
		bmiCategory = "severely obese";
		}	
		if (bmi > 40.0 ) 
		{
		bmiCategory = "severely (or \"morbidly\") obese";
		}	
	
		System.out.println("BMI Category: " + bmiCategory);
	
	
	
	
	}
}