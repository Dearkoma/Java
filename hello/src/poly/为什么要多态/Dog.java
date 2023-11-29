package poly.为什么要多态;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void cry() {
        System.out.println("大黄");
    }
}
