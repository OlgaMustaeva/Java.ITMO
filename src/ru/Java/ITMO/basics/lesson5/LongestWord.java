package ru.Java.ITMO.basics.lesson5;
import java.util.Arrays;
public class LongestWord {
    public static String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return null;
        }
        String cleanedText = text.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        String[] words = cleanedText.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        String text = "Найти самое длинное слово";
        String longestWord = findLongestWord(text);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}
