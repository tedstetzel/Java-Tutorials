import java.util.Random;

public class Rando
{
  public static void main(String[] args) {

  }

  static int classicRando(int randomScope)
    {
      int num;
      Random r = new Random();
      num = r.nextInt(randomScope) + 1;
      return num;
    }

}
