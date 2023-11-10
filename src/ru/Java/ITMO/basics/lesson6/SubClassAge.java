package ru.Java.ITMO.basics.lesson6;
class SubClassAge extends Age {
    @Override
    public int getUserAge() {
        System.out.print("Введите ваш возраст: ");
        String ageString = scanner.next();
        int age = Integer.parseInt(ageString);
        return age;
    }
}


