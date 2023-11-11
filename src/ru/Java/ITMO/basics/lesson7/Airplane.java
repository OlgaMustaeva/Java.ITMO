package ru.Java.ITMO.basics.lesson7;
public class Airplane {
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
        Airplane airplane = new Airplane();
        Wing wing = airplane.new Wing();
        wing.setWeight(1500.0);
        System.out.println("Weight of wing: " + wing.getWeight());
    }
}
