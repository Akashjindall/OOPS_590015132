class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}
class Thread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}
public class mutltithreading {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        t1.start();
        try {
            t1.join(); // Wait for t1 to finish before starting t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2 = new Thread2();
        t2.start();
    }
}