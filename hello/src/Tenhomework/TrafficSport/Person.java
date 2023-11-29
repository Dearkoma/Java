package Tenhomework.TrafficSport;

public class Person {
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        vehicles =FactoryTraffic.getBoat();
        //判断当前vehicles是不是船不是船就创建船,null和马都创建
        //是船就直接调用,不是船就创建船
        if (!(vehicles instanceof Boat)) {
            vehicles = FactoryTraffic.getBoat();
        }
        vehicles.work();
    }

    public void passland() {
        //同理
        if (!(vehicles instanceof Horse)) {
            //多态
            vehicles = FactoryTraffic.getHorse();
        }
        //接口动态调用
        vehicles.work();
    }

    public void passFireMountains() {
        if (!(vehicles instanceof Fly)) {
            vehicles = FactoryTraffic.getFly();
        }
        vehicles.work();
    }
} 