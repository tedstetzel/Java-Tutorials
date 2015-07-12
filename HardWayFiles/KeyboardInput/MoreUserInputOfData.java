import java.util.Scanner;

class MoreUserInputOfData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName, lastName, login;
		int grade, studentID;
		float gpa;
		
		System.out.print("First name: ");
		firstName = keyboard.next();
		
		System.out.print("Last name: ");
		lastName = keyboard.next();		
		
		System.out.print("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.print("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.print("Login: ");
		login = keyboard.next();
		
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextFloat();
		
		System.out.println(" ");
		
		System.out.println("Your information:");
		System.out.println("          Login: " + login);
		System.out.println("          ID:    " + studentID);
		System.out.println("          Login: " + lastName + ", " + firstName);		
		System.out.println("          GPA:   " + gpa);
		System.out.println("          Grade: " + grade);		
		
	}
}
		
		