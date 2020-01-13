import java.util.ArrayList;
import java.util.Random;
import static java.lang.System.*;

public class Sorting {
    static Random rand = new Random();
    static ArrayList<Integer> num = new ArrayList<>();
    static int nMax = 200;
    static int[] numRandom = new int[nMax];

    private static void randNum() {
        for (int i = 0; i < nMax; i++)
            num.add(i + 1);
        for (int i = 0; i < numRandom.length; i++) {
            int size = num.size();
            numRandom[i] = num.remove(rand.nextInt(size));
        }
    }

    private static void arrayToString(int[] array) {
        out.print("[");
        for (int i = 0; i < array.length; i++)
            out.print(i == array.length - 1 ? array[i] : (array[i] + ", "));
        out.print("]");
    }

    private static void sort(int dim) {

    }

    public static void main(String[] s) {
        randNum();
        // out.println(num.toString());
        arrayToString(numRandom);
    }
}