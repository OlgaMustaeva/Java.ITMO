package ru.Java.ITMO.basics.lesson6;
public class MailClass {
    private int number;
    public static void main(String[] args) {
        MailClass mainObj = new MailClass();
        mainObj.setNumber(10);

        SubClass subObj = new SubClass();
        subObj.printNumber(mainObj.getNumber());
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}

