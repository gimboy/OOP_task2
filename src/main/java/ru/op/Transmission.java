package ru.op;

public class Transmission {
    private int grNumber;

    public void switchGear (int number) {
        this.grNumber = number;
        System.out.printf("Trans changed on %d%n...", number);
    }

    public int getGrNumber() {
        return grNumber;
    }
}