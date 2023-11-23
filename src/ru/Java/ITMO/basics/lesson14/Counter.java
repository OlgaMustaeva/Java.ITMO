package ru.Java.ITMO.basics.lesson14;
import java.util.concurrent.CountDownLatch;
public class Counter {
    private int count = 0;
    public synchronized void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}
class IncrementThread extends Thread {
    private Counter counter;
    private CountDownLatch latch;
    public IncrementThread(Counter counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        latch.countDown();
    }
}



