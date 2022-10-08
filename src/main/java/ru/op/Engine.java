package ru.op;

public class Engine {
    private Boolean work;

    public void start () {
        this.work = true;
        System.out.println("Engine start");
    }

    public void stop () {
        this.work = false;
        System.out.println("Engine stop...");
    }

    public void throttleUp(int level) {
        if (this.work) {
            System.out.printf("Throttle open %d%n...", level);
        }
    }

    public Boolean getWork() {
        return work;
    }
}