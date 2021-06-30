import java.util.Arrays;
import java.util.Random;
import java.util.Formatter;

// #1
public class Homework1 {
    private static int[] insert(int[] array, int index, int value) {
        // empty array return back
        if (array.length == 0) {                                   // O(1)
            return array;
        }
        // creating a bigger array, reference holder
        int[] newArray = new int[array.length + 1];                // O(1)
        // copy array [0, index) to newArray [0, index)
        for (int i = 0; i < index; i++) {                          // O(n)
            newArray[i] = array[i];                                // O(1)
        }
        // set newArray[index] equal to value
        newArray[index] = value;                                   // O(1)
        // copy array [index, length) to newArray[index + 1, length +1)
        for (int i = index + 1; i <= array.length; i++) {          // O(n)
            // newArray[i + 1] = array[i]
            newArray[i] = array[i -1];                             // O(1)
        }
        return newArray;                                           // O(1)
    }


// #2

    public static void main(String[] args) {
        final double NUM_READINGS = 60;
        final double INSERTS_PER_READING = 1000;
        // declare a new array with one element in it starting with a value with 0
        int[] array = new int[]{0};
        // looping thru 60 readings
        // output reading in tabular format
        System.out.format("%10s\t%18s\n", "Array length", "Seconds per insert");
        for (int i = 0; i < NUM_READINGS; i++) {
            long start = System.currentTimeMillis();
            // each reading will be taken after INSERTS_PER_READING inserts
            for (int j = 0; j < INSERTS_PER_READING; j++) {
                // let index is random integer in range of array [0, length)
                int min = 0;
                int max = array.length;
                // let value is random integer
                Random random = new Random();
                int index = min + (int) (Math.random() * max);
                int value = random.nextInt();
                array = Homework1.insert(array, index, value);
            }
            long stop = System.currentTimeMillis();

            double timePerInsert = (double) (stop - start) / INSERTS_PER_READING;
            // output reading in tabular format
            System.out.format("%10s\t%18s\n", array.length, timePerInsert);
        }
    }
}