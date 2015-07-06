import java.util.*;

public class SortingAnArraylistOfStrings
{
  public static void main(String[] args)
  {
    sortingAnArraylist();
  }

  static void sortingAnArraylist()
  {
  ArrayList<String> list = new ArrayList<String>();

    list.add("TBone");
    list.add("Steak");
    list.add("Cheese");
    list.add("Eggs");
    list.add("Weltch's");
    list.add("Grape");




  System.out.println("ArrayList before sorting: " + list );


  //Sort results
  Collections.sort(list);

  System.out.println("ArrayList after sorting: " + list );

  }



}
