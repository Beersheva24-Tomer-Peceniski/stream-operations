package telran.stream;

import java.util.Random;
// import telran.stream.StreamTasks.*;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
    Random random = new Random();
    @Test
    void shuffleTest() {
    int [] array = random.ints( 1, 50).distinct().limit(6).toArray();
    StreamTasks.shuffle(array);
    }
}