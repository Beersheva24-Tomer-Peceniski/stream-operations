package telran.stream;

import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int [] arr) {
        Random random = new Random();
        int[] shuffledArray = random.ints(0, arr.length).distinct().limit(6).toArray();
        int[] result = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[shuffledArray[i]];
            }
        return result;
    }
}