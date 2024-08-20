package telran.stream;

import java.util.Arrays;
import java.util.Random;
// import telran.stream.StreamTasks.*;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            Random random = new Random();
            int[] array =  random.ints( 1, 50).distinct().limit(6).toArray();
            int [] shuffledArray = StreamTasks.shuffle(array);
            System.out.println(tester(shuffledArray, array));
        }
    }

    private static boolean tester(int[] tester, int[] completed) {
        boolean result = true;
        for (int item : tester) {
            if (! Arrays.stream(completed).anyMatch(value -> value == item)) {
                result = false;
            }
        }
        return result;
    }
}