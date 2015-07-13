import java.util.Scanner;

public class TwentyQuestions
{
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		String q1, q2;
		
		String answer = "";
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		
		System.out.println("Question 1) Is it animal, vegetable or mineral?");
		q1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		q2 = keyboard.next();
	
		if (q1.equals("animal"))
		{
		
			if (q2.equals("yes"))
			{
			answer = "moose";
			}
		
			else if (q2.equals("no"))
			{
			answer = "squirrel";
			}
		
		}
		else if (q1.equals("vegetable"))
		{
		
			if (q2.equals("yes"))
			{
			answer = "watermelon";
			}
		
			else if (q2.equals("no"))
			{
			answer = "carrot";
			}
		
		}
		
		else if (q1.equals("mineral"))
		{
			if (q2.equals("yes"))
			{
			answer = "Camaro";
			}
		
			else if (q2.equals("no"))
			{
			answer = "paper clip";
			}
		}
		
		System.out.println("");
		System.out.println("Your're thinking of a " + answer + "!");
		System.out.println("I would ask you if I'm right, but I don't actually care");
	
	}
}