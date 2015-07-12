import java.util.Random;

public class LocatingLargest
  {
    public static void main(String[] args)
    {
      int[] myNumbers;
      myNumbers = new int[10];
      int largestNumber = 0;
      int location = 0;
      System.out.println("+----------------------------------------+");

      System.out.print("Array: ");

        for (int i=0;i < myNumbers.length;i++)
        {
          myNumbers[i] = classicRando();
          System.out.print(myNumbers[i] + " ");

          if (myNumbers[i] > largestNumber)
          {
            largestNumber = myNumbers[i];
            location = i;
          }
        }

        System.out.println("\nThe largest number is " + largestNumber);
        System.out.println("It is in slot " + location);
        System.out.println("+----------------------------------------+");


    }
    public static int classicRando()
      {
        Random r = new Random();
        int rando = r.nextInt(50) + 1;
        return rando;
      }



  }
