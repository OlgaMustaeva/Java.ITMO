package ru.Java.ITMO.basics.lesson6;
public class Abstract {
    public static void main(String[] args) {
        Client client = new Client("Олег", "Иванов", "Сбербанк");
        client.displayInfo();
        BankEmployee bankEmployee = new BankEmployee("Виталий", "Чижиков", "Сбербанк");
        bankEmployee.displayInfo();
    }
    static abstract class Person {
        private String firstName;
        private String lastName;
        public Person(String firstName, String lastName) {
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
    static class Client extends Person {
        private String bankName;
        public Client(String firstName, String lastName, String bankName) {
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
            System.out.println("Bank: " + bankName);
        }
    }
    static class BankEmployee extends Person {
        private String bankName;

        public BankEmployee(String firstName, String lastName, String bankName) {
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
            System.out.println("Bank: " + bankName);
        }
    }
}


