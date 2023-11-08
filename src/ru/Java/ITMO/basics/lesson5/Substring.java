package ru.Java.ITMO.basics.lesson5;
import java.util.Scanner;
public class Substring {
public static int countOccurrences(String mainString, String substring) {
    int count = 0;
    int index = mainString.indexOf(substring);

    while (index != -1) {
        count++;
        index = mainString.indexOf(substring, index + 1);
    }
    return count;
}
    public static void main(String[] args) {
        String mainString = "бякабякабяка";
        String substring = "бяка";

        int occurrences = countOccurrences(mainString, substring);
        System.out.println("Количество вхождений: " + occurrences);
    }
}
