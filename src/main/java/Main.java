import algorithm.BinarySearch;
import algorithm.Sorting;
import simple.Cesar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        String firstCipher = "gluhtlishjrvbadvyyplkaohavbyjpwolypzavvdlhrvuuleatlzzhnlzdpajoavcpnlulyljpwolyrlfdvykpzaolopkkluzftivsvmklhaoputfmhcvypalovsilpuluk";
//        String secondCipher = "vwduwljudeehghyhubwklqjlfrxogilqgsohdvhuhwxuqdqbeoxhsulqwviruydxowdqgdodupghvljqedvhgrqzklfkedqnbrxghflghrqldpvhwwlqjxsvdihkrxvhfr";
//
//        new Cesar().encryption("wiki", 6);
//        new Cesar().desencryption(firstCipher);
//        int[] items = new int[5];
//        items[0] = 1;
//        items[1] = 3;
//        items[2] = 5;
//        items[3] = 7;
//        items[4] = 9;
//        System.out.println("Result Index => " + new BinarySearch().lookup(items,1));

        String[] stringItem = new String[5];
        stringItem[0] = "Will";
        stringItem[1] = "Lucas";
        stringItem[2] = "Jean";
        stringItem[3] = "Luis";
        stringItem[4] = "Liz";
        System.out.println("Result Index => " + new BinarySearch().lookup(stringItem,"Lucas"));

        // binary search does not work for strings
        System.out.println(Arrays.binarySearch(stringItem, "Lucas"));

        int[] arr = {5, 3, 6, 2, 10, 0, 10, 30, -1, 9, 100};
        int[] sort = Sorting.selectionSort(arr);

        System.out.println(Arrays.toString(sort));

    }
}
