package ru.Java.ITMO.basics.lesson2;

public class Person {
    private String name;
    private int age;
    public Person() {
        name = "";
        age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        Person person2 = new Person("Ivan", 75);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}