package Recursion;

public class Recursion_Add {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int result = Add(arr, arr.length);
        System.out.println(result);
    }

    public static int Add(int[] arr, int number) {
        if (number <= 0) {
            return 0;
        }
        return Add(arr, number - 1) + arr[number - 1];
    }
}
