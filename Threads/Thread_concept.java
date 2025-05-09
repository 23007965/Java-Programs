package Threads;
public class Thread_concept extends Thread {
    public static void main(String[] args) {
        Thread_concept th = new Thread_concept();
        // th.run();
        th.start();

        Thread_concept th1 = new Thread_concept();
        // th.run();
        th1.start();

        Thread_concept th2 = new Thread_concept();
        // th.run();
        th2.start();
    }

    @Override

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}