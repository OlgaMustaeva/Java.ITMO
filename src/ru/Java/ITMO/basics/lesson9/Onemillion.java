package ru.Java.ITMO.basics.lesson9;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Onemillion {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);
        long arrayListTime = measureSelectionTime(arrayList, 100_000);
        long linkedListTime = measureSelectionTime(linkedList, 100_000);

        System.out.println("Время, потраченное на добавление 1 млн элементов в ArrayList: " + arrayListTime + " ms");
        System.out.println("Время, потраченное на добавление 1 млн элементов в LinkedList: " + linkedListTime + " ms");
    }
    private static void addElements(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
        }
    }
    private static long measureSelectionTime(List<Integer> list, int n) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
