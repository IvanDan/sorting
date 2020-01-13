import java.util.ArrayList;
import java.util.Random;
import static java.lang.System.*;

public class Sorting {
    static Random rand = new Random();
    static ArrayList<Integer> num = new ArrayList<>();
    static int nMax = 10;
    static int[] num2 = new int[nMax];

    private static void randNum() {
        int aRandNum;
        int countWhile;
        aRandNum = rand.nextInt(nMax) + 1;
        countWhile = 1;
        while (num.size() != nMax) {
            out.println("countWhile -> " + countWhile);
            if (!num.contains(aRandNum)) {
                num.add(aRandNum);
            } else {
                aRandNum = rand.nextInt(nMax) + 1;
            }
            countWhile++;
        }
    }

    private static void sort(int dim) {

    }

    public static void main(String[] s) {
        randNum();
        out.println(num.toString());
    }
}