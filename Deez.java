import java.util.Scanner;

public class Deez
  {
    public static void main(String[] args)
    {

      Scanner keyboard = new Scanner(System.in);

      System.out.println("What is your name");

      String name = keyboard.nextLine();

      System.out.println("What is lover's name?");

      String loverName = keyboard.nextLine();

      System.out.println( name + " and " + loverName + " sitting in a tree.");

    }


}
