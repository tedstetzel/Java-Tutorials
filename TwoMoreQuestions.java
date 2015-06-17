import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		String inside, alive, answer;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Question 1) Does it stay inside or outside or both?");
		inside = keyboard.next();
		
		System.out.print("Question 2) Is it a living thing?");
		alive = keyboard.next();
		
		//ALIVE
		if (inside.equals("yes") && alive.equals("inside"));
		{ 
		answer = "houseplant";
		}
		
		if (inside.equals("yes") && alive.equals("outside"));
		{
		answer = "bison";
		}
		
		if (inside.equals("yes") && alive.equals("both"));
		{
		answer = "dog";
		}
		
		//NOT ALIVE
		
		if (inside.equals("no") && alive.equals("inside"));
		{
		answer = "shower curtain";
		}
		
		if (inside.equals("no") && alive.equals("outside"));
		{
		answer = "billboard";
		}
		
		if (inside.equals("no") && alive.equals("both"));
		{
		answer = "cell phone";
		}
		
				System.out.println("------------------------------");
		System.out.println("I know, it mush be a " + answer);
		
		
	}
}