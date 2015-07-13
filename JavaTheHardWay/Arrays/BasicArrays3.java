import java.util.Random;

public class BasicArrays3
{
    public static void main(String[] args)
    {

      int[] rowArray;
      rowArray = new int[1000];


      for(int i = 0; i < rowArray.length; i++)
        {
          rowArray[i] = classicRando();
          System.out.print(rowArray[i] + "  ");
        }
    }

    public static int classicRando()
    {
      Random r = new Random();
      int rando = r.nextInt(89) + 10;
      return rando;
    }
}
