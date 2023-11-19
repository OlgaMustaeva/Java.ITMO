package ru.Java.ITMO.basics.lesson10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class File {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
    public static void main(String[] args) {
        String filePath = "files/text.txt";

        try {
            List<String> lines = readFile(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
