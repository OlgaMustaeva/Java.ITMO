package ru.Java.ITMO.basics.lesson14;
import java.util.concurrent.CountDownLatch;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);

        for (int i = 0; i < 100; i++) {
            IncrementThread thread = new IncrementThread(counter, latch);
            thread.start();
        }
        latch.await();
        System.out.println("Count: " + counter.getCount());
    }
}
