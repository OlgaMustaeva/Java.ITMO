package ru.Java.ITMO.basics.lesson9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<User, Integer> userScores = new HashMap<>();
        User user1 = new User("Олег");
        userScores.put(user1, 300);
        User user2 = new User("Мария");
        userScores.put(user2, 270);
        User user3 = new User("Владислав");
        userScores.put(user3, 156);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String inputName = scanner.nextLine();
        for (Map.Entry<User, Integer> entry : userScores.entrySet()) {
            User user = entry.getKey();
            Integer score = entry.getValue();
            if (user.getName().equals(inputName)) {
                System.out.println("Количество очков у пользователя " + user.getName() + ": " + score);
                return;
            }
        }
        System.out.println("Пользователь с таким именем не найден.");
    }
}