package ru.Java.ITMO.basics.lesson4;
public class ArraySwap {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        System.out.print("Array 1: ");
        printArray(array);
        swapFirstAndLast(array);
        System.out.print("Array 2: ");
        printArray(array);
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
    }
    public static void swapFirstAndLast(int[] array) {
        if (array.length > 0) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }
}