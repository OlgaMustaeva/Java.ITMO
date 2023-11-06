package ru.Java.ITMO.basics.lesson2;
public class Calculator {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static long sum(long a, long b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
    public static long division(long a, long b) {
        return a % b;
    }
    public static int division(int a, int b) {
        return a % b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static long multiplication(long a, long b) {
        return a * b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static long subtraction(long a, long b) {
        return a - b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }


    public static void main(String[] args) {

        double aDouble = 2.5;
        double bDouble = 1.5;
        double sumDouble = Calculator.sum(aDouble, bDouble);
        double divisionDouble = Calculator.division(aDouble, bDouble);
        double multiplicationDouble = Calculator.multiplication(aDouble, bDouble);
        double subtractionDouble = Calculator.subtraction(aDouble, bDouble);

        long aLong = 5L;
        long bLong = 3L;
        long sumLong = Calculator.sum(aLong, bLong);
        long divisionLong = Calculator.division(aLong, bLong);
        long multiplicationLong = Calculator.multiplication(aLong, bLong);
        long subtractionLong = Calculator.subtraction(aLong, bLong);

        int aInt = 10;
        int bInt = 4;
        int sumInt = Calculator.sum(aInt, bInt);
        int divisionInt = Calculator.division(aInt, bInt);
        int multiplicationInt = Calculator.multiplication(aInt, bInt);
        int subtractionInt = Calculator.subtraction(aInt, bInt);

        System.out.println("Sum double: " + sumDouble);
        System.out.println("Division double: " + divisionDouble);
        System.out.println("Multiplication double: " + multiplicationDouble);
        System.out.println("Subtraction double: " + subtractionDouble);

        System.out.println("Sum long: " + sumLong);
        System.out.println("Division long: " + divisionLong);
        System.out.println("Multiplication long: " + multiplicationLong);
        System.out.println("Subtraction long: " + subtractionLong);

        System.out.println("Sum int: " + sumInt);
        System.out.println("Division int: " + divisionInt);
        System.out.println("Multiplication int: " + multiplicationInt);
        System.out.println("Subtraction int: " + subtractionInt);

    }
}
