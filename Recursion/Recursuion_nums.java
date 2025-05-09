package Recursion;
public class Recursuion_nums {
    public static void main(String[] args) {
        Loop(100);

    }

    public static void Loop(int number) {
        // 1st step to define the base case
        if (number < 1) {
            return;
        }
        Loop(number - 1);
        System.out.print(number + " ");
    }
}
