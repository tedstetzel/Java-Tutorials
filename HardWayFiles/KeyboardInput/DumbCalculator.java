import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
	
	Scanner keyboard = new Scanner(System.in);
	float firstNum, secondNum, thirdNum;
	
	System.out.print("What is your first number?");
	firstNum = keyboard.nextFloat();
	
	System.out.print("What is your second number?");
	secondNum = keyboard.nextFloat();
	
	System.out.print("What is your second number?");
	thirdNum = keyboard.nextFloat();
	
	System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") /2 is..." +((firstNum + secondNum + thirdNum)/2));
	}
}