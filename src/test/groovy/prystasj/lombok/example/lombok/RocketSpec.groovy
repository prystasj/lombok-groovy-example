package prystasj.lombok.example.lombok

import spock.lang.Specification

class RocketSpec extends Specification {

    def name = "LombokRocket"
    def booster = new Booster()

    def rocket = new Rocket(name, booster)

    def "initially has not taken off"() {
        expect: !rocket.isStarted()
    }

    def "can takeoff"() {
        when: rocket.takeoff()
        then: rocket.isStarted()
    }

    def "has a name that can be changed"() {
        when: rocket.name =  name.reverse()
        then: rocket.name == name.reverse()
    }

}
