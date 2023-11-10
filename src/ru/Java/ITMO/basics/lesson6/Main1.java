package ru.Java.ITMO.basics.lesson6;
public class Main1 {
    public static void main(String[] args) {
         SubClassAge age = new SubClassAge();
        int userAge = age.getUserAge();
        System.out.println("Ваш возраст: " + userAge);
    }
}
