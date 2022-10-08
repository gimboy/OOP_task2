package ru.op;

public class Door {
    private boolean isOpen = false;
    private boolean isLocked = false;

    public boolean getStatus(){
        return !isOpen;
    }

    public void open(){
        if(isLocked == false){
            if(isOpen == false)
            {
                isOpen = true;
                System.out.printf("Door is %b",this.isOpen);
            } else {
                System.out.println("Door can't be open");
            }
        } else {
            System.out.println("Door blocked");
        }
    }

    public void close(){
        if(isOpen == true){
            isOpen = false;
            System.out.printf("Door is %b...",this.isOpen);
        } else {
            System.out.println("Door closed...");
        }
    }

    public void lockDoor(){
        isLocked = true;
    }
    public void unlockDoor(){
        isLocked = false;
    }
}