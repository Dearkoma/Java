package Tenhomework.TrafficSport;

public class FactoryTraffic {
    private static Horse horse = new Horse();
    private FactoryTraffic(){}
    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Fly getFly() {
        return new Fly();
    }
}