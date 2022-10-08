package ru.op;

public class Automobile {
    private Base automobile = new Base();

    public void producer(){
        System.out.println("Bugatti");
    }

    public void startAuto(){
        automobile.start();
    }

    public void stopAuto(){
        automobile.stop();
    }

    public void driveAuto(){
        automobile.drive();
    }

    public void startConder(){
        automobile.startCondition();
    }

    public void stopConder(){
        automobile.stopCondition();
    }
}