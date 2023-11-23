package ru.Java.ITMO.basics.lesson14;
public class Twostreams extends Thread {
    private final String name;
    private final Object lock;
    public Twostreams(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                try {
                    System.out.println(name);
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




