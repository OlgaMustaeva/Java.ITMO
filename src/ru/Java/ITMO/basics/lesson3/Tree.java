package ru.Java.ITMO.basics.lesson3;
public class Tree {
    private int age;
    private boolean isAlive;
    private String name;
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Tree(int age, boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public static void main(String[] args) {

        Tree tree1 = new Tree(10, "Ель");
        System.out.println("Дерево 1: Возраст - " + tree1.age + ", Название - " + tree1.name);

        Tree tree2 = new Tree(5, true, "Кедр");
        System.out.println("Дерево 2: Возраст - " + tree2.age + ", Живое - " + tree2.isAlive + ", Название - " + tree2.name);

        Tree tree3 = new Tree();
    }
}
