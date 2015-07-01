import java.util.Scanner;


class LilDatabase
{
  String name;
  int grade;
  double average;

}

public class BasicRecords
  {
    public static void main(String[] args)
    {


      Scanner keyboard = new Scanner(System.in);

      Students firstStudent = new Students();
      System.out.print("Enter the first student's name: ");
      firstStudent.name = keyboard.nextLine();
      System.out.print("Enter the first student's grade: ");
      firstStudent.grade = keyboard.nextInt();
      System.out.print("Enter the first student's average: ");
      firstStudent.average = keyboard.nextDouble();

      System.out.print("\n");

      Students secondStudent = new Students();
      System.out.print("Enter the second student's name: ");
      secondStudent.name = keyboard.next();
      System.out.print("Enter the second student's grade: ");
      secondStudent.grade = keyboard.nextInt();
      System.out.print("Enter the second student's average: ");
      secondStudent.average = keyboard.nextDouble();

      System.out.print("\n");

      Students thirdStudent = new Students();
      System.out.print("Enter the third student's name: ");
      thirdStudent.name = keyboard.next();
      System.out.print("Enter the third student's grade: ");
      thirdStudent.grade = keyboard.nextInt();
      System.out.print("Enter the third student's average: ");
      thirdStudent.average = keyboard.nextDouble();

      System.out.println("");

      System.out.println("The names are: " + firstStudent.name + " " + secondStudent.name + " " + thirdStudent.name);
      System.out.println("The grades are: " + firstStudent.grade + " " + secondStudent.grade + " " + thirdStudent.grade);
      System.out.println("The averages are: " + firstStudent.average + " " + secondStudent.average + " " + thirdStudent.average);

      System.out.println("");

      System.out.println("The averages for the three students is " + ((firstStudent.average  + secondStudent.average + thirdStudent.average)/3));

      System.out.println("");

    }

  }
