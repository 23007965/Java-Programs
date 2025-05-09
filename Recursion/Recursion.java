package Recursion;
public class Recursion {
    public static void main(String[] args) {
        WelcomeMsg(5);
    }

    public static void WelcomeMsg(int count) {
        if (count < 1) {
            return;
        }
        System.out.println("Hello world");
        WelcomeMsg(count - 1);
    }
}
