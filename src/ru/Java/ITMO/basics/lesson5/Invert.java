package ru.Java.ITMO.basics.lesson5;
public class Invert {
    public static String invertWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder invertedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder invertedWord = new StringBuilder(word).reverse();
            invertedSentence.append(invertedWord).append(" ");
        }
        return invertedSentence.toString().trim();
    }
    public static void main(String[] args) {
        String sentence = "Ученье свет а неученье тьма";
        System.out.println("Приведенная строка: " + sentence);
        System.out.println("Перевернутая строка: " + invertWords(sentence));
    }
}
