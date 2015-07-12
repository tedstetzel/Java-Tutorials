import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class GradesInAnArrayAndAFile
  {
    public static void main(String[] args) throws IOException
      {

      Scanner keyboard = new Scanner(System.in);
      String name, fileName;
      int [] grades;
      grades = new int[5];



      //ask name
      System.out.print("\nName (first last): ");
      name = keyboard.nextLine();
      //ask file name and create file object
      System.out.print("Filename: ");
      fileName = keyboard.nextLine();
      FileWriter gradesFile = new FileWriter (fileName);

      //output grades in loop to cmd and new file
      System.out.println("\nHere are your randomly selected grades:");

      for (int i = 0; i < grades.length; i++)
        {
            grades[i] = classicRando();
            System.out.println("Grade " + (i + 1) + ": " + grades[i] );
            gradesFile.write("Grade " + (i + 1) + ": " + grades[i] + "\n");
        }
        gradesFile.close();
        System.out.println("\nGrades saved to: \"" + fileName + "\"\n");
      }



      public static int classicRando()
        {
          Random r = new Random();
           int rando = r.nextInt(100) + 1;
          return rando;
        }

  }
