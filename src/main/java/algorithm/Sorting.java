package algorithm;

/**
 * Created by willyaguirre on 3/07/17.
 */
public class Sorting {

    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        int smallestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return  smallestIndex;
    }

    private static int[] getNewArrWithoutSmallest(int[] arr, int smallestIndex) {
        int[] newArrWithoutSmallest = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < smallestIndex) {
                newArrWithoutSmallest[i] = arr[i];
            } else if (i > smallestIndex) {
                newArrWithoutSmallest[i - 1] = arr[i];
            }
        }
        return newArrWithoutSmallest;
    }

    public static int[] selectionSort(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < newArr.length; i++){
            int smallestIndex = findSmallest(arr);
            newArr[i] = arr[smallestIndex];
            arr = getNewArrWithoutSmallest(arr, smallestIndex);
        }
        return newArr;
    }

}
