import static java.lang.System.*;

public class Main {

    public static void main(String[] s) {
        int[] fullNumRandom = Utils.fullRandNum(10, 10);
        Utils.printArray(fullNumRandom);
        int[] arraySorted = Sorter.countingSort(fullNumRandom);
        Utils.printArray(arraySorted);
    }
}