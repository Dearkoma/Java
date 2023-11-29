package 类的作业;

public class homework07 {
    public static void main(String[] args) {
        Dog dog = new Dog("ALice", "blue", 10);
        dog.shown();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void shown() {
        System.out.println("名字:" + name);
        System.out.println("颜色:" + color);
        System.out.println("年龄:" + age);
    }
    
}
