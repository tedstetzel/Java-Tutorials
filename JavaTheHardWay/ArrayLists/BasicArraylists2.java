import java.util.Random;
import java.util.ArrayList;

public class BasicArraylists2
{






  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();


    for (int i = 0; i < 10; i++ )
      list.add(classicRando());

      System.out.println("Array List: " + list);

    }

    static int classicRando()
     {
       int num;
       Random r = new Random();
       num = r.nextInt(100) + 1 ;
       return num;

     }


}
