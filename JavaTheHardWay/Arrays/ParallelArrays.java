import java.util.Scanner;

public class ParallelArrays
  {
  public static void main(String [] args)
  {
    String [] names = {"Mitchell" , "Ortiz", "Luu", "Zimmerman", "Brooks"};
    double [] grades = {99.5, 78.5, 95.6, 96.8, 82.7};
    int [] ids = {123, 456, 789, 987, 654};
    Scanner keyboard = new Scanner(System.in);
    int found = 0;

    System.out.println("Values:");

    for (int i = 0; i < names.length;i++)
      {
        System.out.println("\t" + names[i] + " " + grades[i] + " " + ids[i]);

      }

      System.out.print("ID number to find: ");
      int idToFind = keyboard.nextInt();

      for (int i = 0; i < names.length;i++)
        {
          if (ids[i] == idToFind)
          {
            System.out.println("\nFound in slot: " + i);
            System.out.println("\tName: " + names[i]);
            System.out.println("\tAverage: " + grades[i]);
            System.out.println("\tID: " + ids[i]);
            found = 1;
          }
        }
        if (found == 0)
        System.out.println("Record not found.");
  }
  }
