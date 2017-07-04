import algorithm.BinarySearch;
import simple.Cesar;

public class Main {

    public static void main(String[] args) {

        String firstCipher = "gluhtlishjrvbadvyyplkaohavbyjpwolypzavvdlhrvuuleatlzzhnlzdpajoavcpnlulyljpwolyrlfdvykpzaolopkkluzftivsvmklhaoputfmhcvypalovsilpuluk";
        String secondCipher = "vwduwljudeehghyhubwklqjlfrxogilqgsohdvhuhwxuqdqbeoxhsulqwviruydxowdqgdodupghvljqedvhgrqzklfkedqnbrxghflghrqldpvhwwlqjxsvdihkrxvhfr";

        //new Cesar().encryption("wiki", 6);
        //new Cesar().desencryption(firstCipher);
        int[] items = new int[5];
        items[0] = 1;
        items[1] = 3;
        items[2] = 5;
        items[3] = 7;
        items[4] = 9;
        System.out.printf("Result Index => " + new BinarySearch().lookup(items,3));

    }
}
