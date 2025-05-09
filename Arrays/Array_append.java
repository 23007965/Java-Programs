package Arrays;
import java.util.*;

public class Array_append {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 9, 13, 42 };
        int[] arr2 = { 3, 5, 7, 24, 63 };
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        Arrays.sort(arr3);
        System.out.println("Aftre sorting " + Arrays.toString(arr3));
    }
}
