package ru.Java.ITMO.basics.lesson5;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        word = word.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки на палиндром:");
        String word = scanner.nextLine();
        if (isPalindrome(word)) {
            System.out.println("Слово '" + word + "' является палиндромом.");
        } else {
            System.out.println("Слово '" + word + "' не является палиндромом.");
        }
    }
}
