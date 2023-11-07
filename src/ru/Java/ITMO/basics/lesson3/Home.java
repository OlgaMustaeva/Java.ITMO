package ru.Java.ITMO.basics.lesson3;

public class Home {
    private int floors;
    private int yearBuilt;
    private String name;
    public void setValues(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }
    public void printValues() {
        System.out.println("Наименование: " + name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + yearBuilt);
    }
    public int calculateYearsSinceBuilt() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearBuilt;
    }
    public static void main(String[] args) {
        Home home1 = new Home();
        Home home2 = new Home();
        home1.setValues(3, 2000, "Дом 1");
        home2.setValues(5, 2010, "Дом 2");

        System.out.println("Информация про первый дом:");
        home1.printValues();
        System.out.println("Количество лет с момента постройки: " + home1.calculateYearsSinceBuilt());
        System.out.println();
        System.out.println("Информация про второй дом:");
        home2.printValues();
        System.out.println("Количество лет с момента постройки: " + home2.calculateYearsSinceBuilt());
    }
}

