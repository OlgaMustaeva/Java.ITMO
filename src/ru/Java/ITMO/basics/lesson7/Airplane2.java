package ru.Java.ITMO.basics.lesson7;
public class Airplane2 {
    class Wing {
        private double weight;
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public double getWeight() {
            return weight;
        }
    }
    public static void main(String[] args) {
        Airplane2 airplane = new Airplane2();
        Wing wing1 = airplane.new Wing();
        Wing wing2 = airplane.new Wing();
        wing1.setWeight(1500.0);
        wing2.setWeight(2000.0);
        System.out.println("Weight of wing 1: " + wing1.getWeight());
        System.out.println("Weight of wing 2: " + wing2.getWeight());
    }
}
