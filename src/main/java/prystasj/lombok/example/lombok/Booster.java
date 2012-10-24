package prystasj.lombok.example.lombok;

import lombok.Getter;

public class Booster {

    @Getter private boolean started = false;

    public void takeoff() {
        System.out.println("3.. 2.. 1.. Lombok Rocket go now!");
        started = true;
    }
}
