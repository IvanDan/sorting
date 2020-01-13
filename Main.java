import static java.lang.System.*;

public class Main {

    public static void main(String[] s) {
        int[] fullNumRandom = Utils.fullRandNum(10, 10);
        out.println("array random");
        Utils.printArray(fullNumRandom);
        int[] arraySorted = Sorter.countingSort(fullNumRandom);
        out.println("array ordinata");
        Utils.printArray(arraySorted);
    }
}