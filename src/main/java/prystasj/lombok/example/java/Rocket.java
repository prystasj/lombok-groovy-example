package prystasj.lombok.example.java;

public class Rocket {

    private final Booster booster;

    private String name;

    public Rocket(String name, Booster booster) {
        this.name = name;
        this.booster = booster;
    }

    public void takeoff() {
        booster.takeoff();
    }

    public boolean isStarted() {
        return booster.isStarted();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
