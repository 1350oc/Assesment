import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Shuffle
{
  public static void main(String args[])
  {
    int[] solutionArray={ 1, 2, 3, 4, 5, 6, 7};

    shuffleArray(solutionArray);
    for(int i=0; i<solutionArray.length; i++)
    {
      System.out.print(solutionArray[i] + " ");
    }
    System.out.println();
  }
  static void shuffleArray(int[] array)
  {
    Random rnd=ThreadLocalRandom.current();
    for(int i=array.length-1; i>0; i--)
    {
      int index=rnd.nextInt(i + 1);
      int a=array[index];
      array[index]=array[i];
      array[i] = a;
    }
  }
} 