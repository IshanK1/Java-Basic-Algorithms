import static java.lang.Math.*; //needed for random method

public class RandomPermutation {
    public static void main(String[] args) {
        int[] randNums = RandomPermutation.next(8);
        System.out.println("Output Random Array = " + java.util.Arrays.toString(randNums));

    }

    public static int[] next(int length) {
        // initializes the arrays
        int[] r = new int[length];
        int[] p = new int[length];

        for (int i = 0; i < length; i++) {
            p[i] = i + 1;
        }

        // keeps track of last used element in array r
        int lastUnusedElementInR = 0;

        // iterate through all elements of array p (last to first element)
        for (int i = length - 1; i >= 0; i--) {
            // Generates random int between 0 and i-1
            int randomNum = (int) (Math.random() * i);

            // Copy the value of random index in p into last unused element in r
            r[lastUnusedElementInR] = p[randomNum];

            // update the last unused element index in r
            lastUnusedElementInR++;

            // copy the last element in p to the random index in p
            p[randomNum] = p[i];

        }
        return r;

    }
}
