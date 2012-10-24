package prystasj.lombok.example.java;

public class Booster {

    private boolean started = false;

    public void takeoff() {
        System.out.println("3.. 2.. 1.. Java Rocket go now!");
        started = true;
    }

    public boolean isStarted() {
        return started;
    }
}
