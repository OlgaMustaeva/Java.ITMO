package ru.Java.ITMO.basics.lesson10;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Filestring {
    public static void main(String[] args) {
        String filePath = "files/text1.txt";
        String content = "Я записала строку в файл";
        writeToFile(filePath, content);
    }
    public static void writeToFile(String filePath, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            writer.close();
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

