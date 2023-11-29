package Tenhomework;

public class Cloth {
    
}

class Frock {
    private static int currentNum = 10000;
    private int serialNumber;
    public static int getCurrentNum() {
        return currentNum+=100;
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getCurrentNum();
    }
       
}

class FrockTest {
    public static void main(String[] args) {
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
    }
}