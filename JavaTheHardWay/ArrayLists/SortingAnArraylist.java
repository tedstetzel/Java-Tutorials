import java.util.*;

public class SortingAnArraylist
{
  public static void main(String[] args)
  {
    int arraySize = Integer.parseInt(args[0]);
    int randomNumberScope = Integer.parseInt(args[1]);

    sortingAnArraylist(arraySize,randomNumberScope);


  }

  static void sortingAnArraylist(int arraySize,int randomNumberScope)
  {
  ArrayList<Integer> list = new ArrayList<Integer>();
  for (int i = 0; i < arraySize; i++)
  list.add(Rando.classicRando(randomNumberScope));

  System.out.println("ArrayList before sorting: " + list );


  //Sort results
  Collections.sort(list);

  System.out.println("ArrayList after sorting: " + list );

  }



}
