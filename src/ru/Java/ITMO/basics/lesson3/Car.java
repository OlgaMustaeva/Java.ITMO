package ru.Java.ITMO.basics.lesson3;

public class Car {

    private String color;
    private String name;
    private int weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public void printCarInfo() {
        System.out.println("Color: " + color);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
          Car car1 = new Car("Red");
        car1.printCarInfo();

        Car car2 = new Car("Blue", 1500);
        car2.printCarInfo();
    }

}
