package ru.Java.ITMO.basics.lesson10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Glue {
    public static void main(String[] args) {
        String filePath1 = "files/text.txt";
        String filePath2 = "files/text1.txt";
        String outputFilePath = "files/glue.txt";
        try {
            List<String> lines1 = readFile(filePath1);
            List<String> lines2 = readFile(filePath2);
            writeToFile(outputFilePath, lines1);
            appendToFile(outputFilePath, lines2);
            System.out.println("Файлы успешно склеены.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static void writeToFile(String filePath, List<String> lines) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void appendToFile(String filePath, List<String> lines) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath, true));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}