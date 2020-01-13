import java.util.ArrayList;
import java.util.Random;
import static java.lang.System.*;

public class Utils {

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

    public static void printArray(int[] array) {
        out.print("[");
        for (int i = 0; i < array.length; i++)
            out.print(i == array.length - 1 ? array[i] : (array[i] + ", "));
        out.print("]\n");
    }
}