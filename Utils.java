import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Random;

public class Utils {
  
  public static String converter(Long millisec) {
    long minute = millisec / 60000;
    long second = millisec % 60000 / 1000;
    long ms = millisec % 60000 % 1000;
    return (minute + "m " + second + "s " + ms + "ms");
  }

  public static int[] cleanRandNum(int nMax) {
    Random rand = new Random();
    ArrayList<Integer> num = new ArrayList<>();
    int[] numRandom = new int[nMax];
    for (int i = 0; i < nMax; i++)
      num.add(i + 1);
    for (int i = 0; i < numRandom.length; i++) {
      int size = num.size();
      numRandom[i] = num.remove(rand.nextInt(size));
    }
    return numRandom;
  }

  public static int[] randNum(int nMax) {
    Random rand = new Random();
    int[] numRandom = new int[nMax];
    for (int i = 0; i < numRandom.length; i++) {
      numRandom[i] = rand.nextInt(nMax);
    }
    return numRandom;
  }

  public static int[] fullCleanRand(int dim) {
    Random rand = new Random();
    ArrayList<Integer> num = new ArrayList<>();
    int[] numRandom = new int[dim];
    int min = -(dim / 2);
    for (int i = 0; i < dim; i++)
      num.add(min++);
    for (int i = 0; i < numRandom.length; i++) {
      int size = num.size();
      numRandom[i] = num.remove(rand.nextInt(size));
    }
    return numRandom;
  }

  /**
   * 
   * @param dim  la dimensione dell'array
   * @param nMax il range dei numeri random
   * @return array con numeri random positivi e negativi
   */
  public static int[] fullRandNum(int dim, int nMax) {
    Random rand = new Random();
    int[] numRandom = new int[dim];
    for (int i = 0; i < numRandom.length; i++) {
      numRandom[i] = rand.nextBoolean() ? rand.nextInt(nMax + 1) : -rand.nextInt(nMax + 1);
    }
    return numRandom;
  }

  public static void printArray(int[] array) {
    out.print("[");
    for (int i = 0; i < array.length; i++)
      out.print(i == array.length - 1 ? array[i] : (array[i] + ", "));
    out.print("]\n");
  }
}