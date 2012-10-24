package prystasj.lombok.example.lombok;

import lombok.Delegate;
import lombok.Getter;
import lombok.Setter;

public class Rocket {

    @Delegate private final Booster booster;

    @Getter @Setter private String name;

    public Rocket(String name, Booster booster) {
        this.name = name;
        this.booster = booster;
    }
}
