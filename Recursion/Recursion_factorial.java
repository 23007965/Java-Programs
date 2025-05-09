package Recursion;

public class Recursion_factorial {
    public static void main(String[] args) {
        int result = Fact(5);
        System.out.println(result);
    }

    public static int Fact(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * Fact(number - 1);
    }
}