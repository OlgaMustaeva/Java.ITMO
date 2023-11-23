package ru.Java.ITMO.basics.lesson14;
public class Streamten {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                for (int j = 0; j <= 100; j++) {
                    System.out.println("Thread " + threadNumber + ": " + j);
                }
            });
            thread.start();
            thread.join();
        }
    }
}
