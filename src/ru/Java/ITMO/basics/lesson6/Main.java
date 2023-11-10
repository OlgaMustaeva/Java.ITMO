package ru.Java.ITMO.basics.lesson6;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(2000, "Volvo", 'B', 80, 8, 5000);
        truck.newWheels(10);
        truck.outPut();
    }
}
