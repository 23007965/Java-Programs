public class Bitwise {
    public static void main(String[] args) {
        int input = 4;
        if ((input & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // right shift -> /2
        System.out.println(6 >> 1);
        // left shift -> *2
        System.out.println(6 << 1);
    }
}