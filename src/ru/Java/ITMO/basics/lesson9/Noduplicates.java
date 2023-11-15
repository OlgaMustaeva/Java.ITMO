package ru.Java.ITMO.basics.lesson9;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
public class Noduplicates {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> set = new HashSet<>(collection);
        return set;
    }
    public static void main(String[] args) {
        Collection<Integer> numbers = List.of(1, 6, 6, 3, 4, 4, 5, 5, 5);
        Collection<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers);
    }
}
