package Threads;

public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();
        thread.start();
        ThreadDemo thread2 = new ThreadDemo();
        thread2.start();
        ThreadDemo thread3 = new ThreadDemo();
        thread3.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}