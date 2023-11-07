package ru.Java.ITMO.basics.lesson4;
import java.util.Scanner;
public class ArrayLength {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
System.out.print("Введите длину массива: ");
    int length = scanner.nextInt();
    int[] array = new int[length];
    System.out.println("Введите числа массива");
    for (int i = 0; i < length; i++) {
        array[i] = scanner.nextInt();
    }
    System.out.print("Результат: ");
    System.out.print("[");
    for (int i = 0; i < length; i++) {
        System.out.print(array[i]);
        if (i != length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");
}
}
