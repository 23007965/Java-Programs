package Arrays;
import java.util.Arrays;

public class Array_insert{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 24, 63}; 
        int element = 53; 
        int[] newArr = new int[arr.length + 1]; 
        int i = 0;
        while (i < arr.length && arr[i] < element) {
            newArr[i] = arr[i]; // Copy elements until the correct position
            i++;
        }

        newArr[i] = element; 

        while (i < arr.length) {
            newArr[i + 1] = arr[i]; // Shift remaining elements
            i++;
        }

        
        System.out.println(Arrays.toString(newArr));
    }
}