package ru.Java.ITMO.basics.lesson14;
public class MainTwostreams {
    public static void main(String[] args) {
        Object lock = new Object();
        Twostreams thread1 = new Twostreams("Поток 1", lock);
        Twostreams thread2 = new Twostreams("Поток 2", lock);
        thread1.start();
        thread2.start();
    }
}
