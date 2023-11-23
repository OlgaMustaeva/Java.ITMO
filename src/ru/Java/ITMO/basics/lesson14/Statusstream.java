package ru.Java.ITMO.basics.lesson14;
public class Statusstream {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        System.out.println("Состояние потока перед запуском: " + thread.getState());
        thread.start();
        System.out.println("Состояние потока после запуска: " + thread.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Состояние потока во время выполнения: " + thread.getState());
    }
}
