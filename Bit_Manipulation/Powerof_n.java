public class Powerof_n {
    public static void main(String[] args) {
        int input = 24;
        if ((input & (input-1)) == 0 ) {
            System.out.println(input + " is power of 2");
        } else {
            System.out.println(input + " is not power of 2");
        }
    }
}