package Threads;
public class Thread_Runable implements Runnable {
    public static void main(String[] args) {
        Thread_Runable Runables = new Thread_Runable();
        Thread thread = new Thread(Runables); // passing the object of the user defined class
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
// new runnable running blocked terminated 