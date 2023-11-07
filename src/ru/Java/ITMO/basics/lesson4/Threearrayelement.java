package ru.Java.ITMO.basics.lesson4;
public class Threearrayelement {
    public static void main(String[] args) {
        int[] array = {3, -3, 7, 4, 5, 4, 3};
        boolean isFirstElementThree = array[0] == 3;
        boolean isLastElementThree = array[array.length - 1] == 3;
        boolean isThreeAtStartOrEnd = isFirstElementThree || isLastElementThree;
        System.out.println("array = 3, -3, 7, 4, 5, 4, 3");
        System.out.println(isThreeAtStartOrEnd);
    }
}
