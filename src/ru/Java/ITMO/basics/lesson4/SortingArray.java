package ru.Java.ITMO.basics.lesson4;
import java.util.Scanner;
public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        boolean sorted = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
