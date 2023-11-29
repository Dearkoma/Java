package Tenhomework;

public class Carandflow {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car2 = new Car(10);
        car2.getAir().flow();
        Car car3 = new Car(-1);
        car3.getAir().flow();
    }
}

class Car {
    private double temperture;
    
    public Car(double temperture) {
        this.temperture = temperture;
    }

    class Air {
        public void flow() {
            if (temperture > 40) {
                System.out.println("吹冷气");
            } else if (temperture < 0) {
                System.out.println("吹热气");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
