import static java.lang.System.*;

public class Main {

    public static void main(String[] s) {
        int[] numRandom = Utils.randNum(10);
        // out.println(num.toString());
        Utils.printArray(numRandom);
        Sorter.countingSort(numRandom);
    }
}