import java.util.Scanner;

public class LittleQuiz
{
	public static void main(String[] args)
	{
	

		Scanner keyboard = new Scanner(System.in);
		short q1, q2, q3;
		short score = 0;
	
		System.out.print("Are you ready for a quiz?  ");
		keyboard.next();
		System.out.println("Okay, here it comes!");
		System.out.println(" ");		
		
		//Question 1
		System.out.println(" ");
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("        1) Melbourne");
		System.out.println("        2) Anchorage");
		System.out.println("        3) Juneau");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("> ");
		q1 = keyboard.nextShort();
		
		if (q1 == 3)
		{
		System.out.println("That's right!");
		score++;
		}
		else 
		{
		System.out.println("Sorry Juneau (3) is the capital of Alaska.");
		}
		
		//Question 2
		System.out.println(" ");
		System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
		System.out.println("        1) Yes");
		System.out.println("        2) No");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("> ");
		q2 = keyboard.nextShort();
		
		if (q2 == 2)
		{
		System.out.println("That's right!");
		score++;
		}
		else 
		{
		System.out.println("Sorry \"cat\" is a string. Ints can only store numbers");
		}
		
		//Question 3
		System.out.println(" ");
		System.out.println("Q3) What is the product of 9+6/3");
		System.out.println("        1) 5");
		System.out.println("        2) 11");
		System.out.println("        3) 15/3");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("> ");
		q1 = keyboard.nextShort();
		
		if (q2 == 2)
		{
		System.out.println("That's right!");
		score++;
		}
		else 
		{
		System.out.println("Sorry 9+6/3 is 11");
		}
		
		System.out.println(" ");
		System.out.println("Overall, you got " + score + " out of 3 correct");
		System.out.println("Thanks for playing!");
	}
}
		