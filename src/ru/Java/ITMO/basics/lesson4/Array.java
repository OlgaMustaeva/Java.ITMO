package ru.Java.ITMO.basics.lesson4;

public class Array {
    public static boolean containsOneOrThree(int[] arr) {
        for (int num : arr) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        System.out.println(containsOneOrThree(arr1));
        int[] arr2 = {1, 5, 9, 3};
        System.out.println(containsOneOrThree(arr2));
    }
}