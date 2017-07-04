package algorithm;

import java.util.Arrays;

/**
 * Created by willyaguirre on 29/06/17.
 */
public class BinarySearch {

    public BinarySearch(){}

    public static Integer lookup(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            System.out.println("guess => " + guess);
            if(guess == item) {
                return mid;
            } else if(guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    // ONLY FOR TEST
    public static Integer lookup(String[] list, String item) {
        int low = 0;
        int high = list.length - 1;
        int mid;

        while (low <= high) {

            mid = (high - low) / 2;

            if(list[mid].compareTo(item) < 0) {
                low = mid + 1;
            } else if (list[mid].compareTo(item) > 0) {
                high = mid - 1;
            } else {
                return mid;

            }

        }

        return -1;
    }

}
