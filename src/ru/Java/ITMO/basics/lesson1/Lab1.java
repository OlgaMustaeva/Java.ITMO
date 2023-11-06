package ru.Java.ITMO.basics.lesson1;
import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args) {


        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");


        double result1 = (46 + 10) * (10 / 3.0);
        double result2 = 29 * 4 * -15;
        System.out.println(result1);
        System.out.println(result2);


        int number = 5;
        double result = (number / 10.0) / 10;
        System.out.println(result);


        double num1 = 3.6;
        double num2 = 4.1;
        double num3 = 5.9;
        double result3 = num1 * num2 * num3;
        System.out.println(result3);

        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int number1 = scanner.nextInt();
//            System.out.println(number1);}

        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");

            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            }

        }
    }
}
