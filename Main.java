import static java.lang.System.*;

public class Main {

  private static void check(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      if (!(a[i] == b[i]))
        out.println("NO");
    }
  }

  public static void main(String[] s) {
    int[] fullNumRandom = Utils.fullRandNum(10000, 99999999);
    int[] arraySorted;
    // out.println("array random");
    // Utils.printArray(fullNumRandom);
    int[] arraySortedA = Sorter.countingSort(fullNumRandom);
    // out.println("array ordinata con couting sort");
    // Utils.printArray(arraySorted);
    // int[] arraySortedB = Sorter.bubbleSort(fullNumRandom);
    // out.println("array ordinata con bubble sort");
    // Utils.printArray(arraySorted);
    int[] arraySortedC = Sorter.bubbleSortOp(fullNumRandom);
    // out.println("array ordinata con bubble sort");
    // Utils.printArray(arraySorted);
    // check(arraySortedA, arraySortedC);
  }
}
