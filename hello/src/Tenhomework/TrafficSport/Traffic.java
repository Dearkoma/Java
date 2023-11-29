package Tenhomework.TrafficSport;

public class Traffic {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.passland();
        tang.passRiver();
        tang.passFireMountains();
    }
}

interface Vehicles {
    public void work();
}
