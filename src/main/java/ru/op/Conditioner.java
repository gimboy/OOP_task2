package ru.op;

public class Conditioner {
    private boolean isOn = false;

    public void start(){
        isOn = true;
        System.out.println("Air cond on...");
    }
    public void stop(){
        isOn = false;
        System.out.println("Air cond ...");
    }
}