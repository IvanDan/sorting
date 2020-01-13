import static java.lang.System.*;

public class Sorter {

    public static int[] countingSort(int[] array) {
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
        out.println("max -> " + max);// TODO debug da rimuovere
        out.println("min -> " + min);// TODO debug da rimuovere
        // inizializzo counterArray al range di numeri da ordinare
        int[] counterArray = new int[max - min + 1];
        // conto i numeri presenti
        for (int i = 0; i < array.length; i++) {
            counterArray[array[i] - min]++;
        }
        Utils.printArray(counterArray);// TODO debug da rimuovere
        for (int i = 0; i < counterArray.length - 1; i++) {
            counterArray[i + 1] += counterArray[i];
        }
        Utils.printArray(counterArray);// TODO debug da rimuovere
        for (int i = 0; i < array.length; i++) {
            arraySorted[counterArray[array[i] - min] - 1] = array[i];
            counterArray[array[i] - min]--;
        }
        return arraySorted;
    }
}