package ru.Java.ITMO.basics.lesson6;
interface BankInfo {
    String getBankName();
}
abstract class Person1 {
    private String firstName;
    private String lastName;
    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public abstract void displayInfo();
}
class Client1 extends Person1 implements BankInfo {
    private String bankName;
    public Client1(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
    @Override
    public void displayInfo() {
        System.out.println("Client Information:");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Bank: " + getBankName());
    }
}
class BankEmployee1 extends Person1 implements BankInfo {
    private String bankName;
    public BankEmployee1(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
    public String getBankName() {
        return bankName;
    }
    @Override
    public void displayInfo() {
        System.out.println("Bank Employee Information:");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Bank: " + getBankName());
    }
}
public class Interface {
    public static void main(String[] args) {
        Client1 client = new Client1("Олег", "Иванов", "Сбербанк");
        client.displayInfo();

        BankEmployee1 bankEmployee = new BankEmployee1("Виталий", "Чижиков", "Сбербанк");
        bankEmployee.displayInfo();
    }
}
