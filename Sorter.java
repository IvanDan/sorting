import static java.lang.System.*;

public class Sorter {

  public static int[] bubbleSort(int[] array) {
    long started = currentTimeMillis();
    boolean sorted = true;
    while (sorted) {
      sorted = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          sorted = true;
        }
      }
    }
    out.println("Bubble sort -> " + Utils.converter(currentTimeMillis() - started));
    return array;
  }

  public static int[] bubbleSortOp(int[] array) {
    long started = currentTimeMillis();
    boolean sorted = true;
    int n = array.length - 1;
    while (sorted) {
      sorted = false;
      for (int i = 0; i < n; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          sorted = true;
        }
      }
      n -= 1;
    }
    out.println("Bubble sort ottimizzato -> " + Utils.converter(currentTimeMillis() - started));
    return array;
  }

  public static int[] countingSort(int[] array) {
    long started = currentTimeMillis();
    int[] arraySorted = new int[array.length];
    int max = 0, min = 0;
    // controllo il massimo e il minimo dei numeri da ordinare
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        max = array[i];
        min = array[i];
      }
      if (max < array[i]) {
        max = array[i];
      }
      if (min > array[i]) {
        min = array[i];
      }
    }
    // inizializzo counterArray al range di numeri da ordinare
    int[] counterArray = new int[max - min + 1];
    // conto i numeri presenti
    for (int i = 0; i < array.length; i++) {
      counterArray[array[i] - min]++;
    }
    for (int i = 0; i < counterArray.length - 1; i++) {
      counterArray[i + 1] += counterArray[i];
    }
    for (int i = 0; i < array.length; i++) {
      arraySorted[counterArray[array[i] - min] - 1] = array[i];
      counterArray[array[i] - min]--;
    }
    out.println("Couting sort -> " + Utils.converter(currentTimeMillis() - started));
    return arraySorted;
  }
}
