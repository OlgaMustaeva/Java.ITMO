package ru.Java.ITMO.basics.lesson4;

public class Array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean containsOneOrThree = false;
        for (int number : array) {
            if (number == 1 || number == 3) {
                containsOneOrThree = true;
                break;
            }
        }
        if (containsOneOrThree) {
            System.out.println("Массив содержит число 1 или 3");
        } else {
            System.out.println("Массив не содержит число 1 или 3");
        }
    }
}