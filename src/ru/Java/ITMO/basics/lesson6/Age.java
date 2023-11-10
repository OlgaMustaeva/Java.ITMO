package ru.Java.ITMO.basics.lesson6;
import java.util.Scanner;
public class Age {
    protected Scanner scanner;
    public Age() {
        scanner = new Scanner(System.in);
    }
    public int getUserAge() {
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        return age;
    }
}
