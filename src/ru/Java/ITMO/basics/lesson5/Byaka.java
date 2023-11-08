package ru.Java.ITMO.basics.lesson5;
public class Byaka {
    public static String censorText(String text) {
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }
    public static void main(String[] args) {
        String originalText = "В тексте есть слово бяка несколько раз";
        String censoredText = censorText(originalText);

        System.out.println("Оригинальный текст:");
        System.out.println(originalText);

        System.out.println("\nТекст после цензуры:");
        System.out.println(censoredText);
    }
}
