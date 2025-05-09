package Recursion;

public class Recursion_GCD {
    public static void main(String[] args) {
        int n1 = 100, n2 = 90;
        int result = HCF(n1, n2);
        System.out.println(result);
    }

    public static int HCF(int n1, int n2) {
        if (n2 != 0) {
            return HCF(n2, n1 % n2);
        } else {
            return n1;
        }
    }
}
