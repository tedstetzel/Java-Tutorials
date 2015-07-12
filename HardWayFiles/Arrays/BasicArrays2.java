import java.util.Random;


public class BasicArrays2
  {
    public static void main(String[] args)
    {

    //declare array
    int [] myArray;
    myArray = new int [10];


    for(int i = 0; i < 10; i++  )
      {
        myArray[i] = classicRando();
        System.out.println("Slot " + i + " contains a " + (1 + myArray[i] ));
      }

    }

  public static int classicRando()
    {

      Random r2 = new Random();
      int rando = 0;

      //call random number

      rando = r2.nextInt(100);

      return rando;

    }


  }
