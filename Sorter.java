import static java.lang.System.*;

public class Sorter {

    public static int[] countingSort(int[] array) {
        int[] arraySorted = new int[array.length];
        int[] counter = new int[array.length];
        for (int i : array) {
            counter[i]++;
        }
        Utils.printArray(counter);
        
        return arraySorted;
    }
}