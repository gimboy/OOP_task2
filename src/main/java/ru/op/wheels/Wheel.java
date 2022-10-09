package ru.op.wheels;

public abstract class Wheel implements Rotating{
    private boolean isSteeringWheel = false;

    public void rotate() {
        System.out.println("Wheel rotate...");
    }

    public void isRudderRotate(){
        if(isSteeringWheel == true)
            System.out.println("Wheel rotating...");
    }

    public void setSteeringWheel(){
        isSteeringWheel = true;
    }
}