package ru.Java.ITMO.basics.lesson10;
import java.io.*;
public class Replacement {
    public static void main(String[] args) {
        String filePath = "files/replacement.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            String replacedContent = content.toString().replaceAll("[^A-Za-zА-Яа-я0-9]", "\\$");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(replacedContent);
            writer.close();
            System.out.println("Файл успешно обработан.");
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}

