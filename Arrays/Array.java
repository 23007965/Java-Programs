package Arrays;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        // add elements in array
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println("The array is ");

        // display the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // get the element
        System.out.print("\nenter the index ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the element in the index " + num + " is " + arr[num]);

        // size of array
        System.out.print("Size of array is " + arr.length);

        // remove an element
        int[] new_arr = new int[arr.length - 1];
        int input = 2;
        int index = 0;
        for (int i = 0; i < new_arr.length; i++) {
            if (arr[i] != input) {
                new_arr[index++] = arr[i];
            }
        }
        System.out.println("\nArray after deletion ");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
