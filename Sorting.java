import java.util.ArrayList;
import java.util.Random;
import static java.lang.System.*;

public class Sorting {
    static Random rand = new Random();
    static ArrayList<Integer> num = new ArrayList<>();
    static int nMax = 20;
    static int[] num2 = new int[nMax];

    private static void randNum() {
        int aRandNum;
        for (int i = 0; i < nMax; i++) {
            aRandNum = rand.nextInt(nMax) + 1;
            while (num.size() != nMax) {
                if (!num.contains(aRandNum)) {
                    num.add(aRandNum);
                } else {
                    aRandNum = rand.nextInt(nMax) + 1;
                }
            }
        }
    }

    private static void sort(int dim) {

    }

    public static void main(String[] s) {
        randNum();
        out.println(num.toString());
        out.println(num.size());
    }
}