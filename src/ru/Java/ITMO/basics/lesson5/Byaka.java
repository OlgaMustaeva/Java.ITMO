package ru.Java.ITMO.basics.lesson5;
public class Byaka {
    public static String censorText(String text, String censorWord, String replacement) {
        return text.replaceAll(censorWord, replacement);
    }
    public static void main(String[] args) {
        String originalText = "В тексте есть слово бяка несколько раз";
        String censorWord = "бяка";
        String replacement = "[вырезано цензурой]";
        String censoredText = censorText(originalText, censorWord, replacement);
        System.out.println("Оригинальный текст:");
        System.out.println(originalText);
        System.out.println("\nТекст после цензуры:");
        System.out.println(censoredText);
    }
}
