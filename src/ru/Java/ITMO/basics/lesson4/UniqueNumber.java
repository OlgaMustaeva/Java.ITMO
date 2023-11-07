package ru.Java.ITMO.basics.lesson4;
public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4};
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Первое уникальное число: " + nums[i]);
                break;
            }
        }
    }
}
