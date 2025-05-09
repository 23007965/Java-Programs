package Sieve_of_erathosthenes;

public class Sieve {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;
        boolean[] arr = new boolean[num + 1];
        for (int i = 0; i < num; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= num; i++) {
            arr[i] = true;
            for (int j = 2; j * i <= num; j++) {
                arr[j * i] = false;
            }
        }

        for (int i = 2; i < num; i++) {
            if (arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}