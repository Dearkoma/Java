package Tenhomework;

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shot();
        dog.shot();
    }
}

abstract class anima {
    public abstract void shot();

}

class Cat extends anima{
    public void shot() {
        System.out.println("猫叫");
    }
}

class Dog extends anima {
    public void shot() {
        System.out.println("狗叫");
    }
}