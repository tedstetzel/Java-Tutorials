import java.util.Random;
import java.util.Scanner;

public class IsItThereOrNot
  {
    public static void main(String[] args)
    {
      int[] myNumbers;
      myNumbers = new int[10];
      Scanner keyboard = new Scanner(System.in);
      int numToFind;
      int timesFound = 0;

      System.out.print("Array: ");

        for (int i=0;i < myNumbers.length;i++)
        {
          myNumbers[i] = classicRando();
          System.out.print(myNumbers[i] + " ");
        }

        System.out.print("\nValue to Find: ");
        numToFind = keyboard.nextInt();


        for(int i=0; i < myNumbers.length; i++)
          {
          if (myNumbers[i] == numToFind)
            {
              timesFound++;
            }

          }
          switch (timesFound) {
          case 0:
            System.out.println(numToFind + " was not found in the array");
          break;
          case 1:
            System.out.println(numToFind + " is in the array ");
          break;
          default:
            System.out.println(numToFind + " is in the array " + timesFound + " times");
          break;

          }
  }
    public static int classicRando()
      {
        Random r = new Random();
        int rando = r.nextInt(50) + 1;
        return rando;
      }



  }
